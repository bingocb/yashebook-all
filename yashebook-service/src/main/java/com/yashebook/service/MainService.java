package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.bo.Success;
import com.yashebook.enums.Methods;
import com.yashebook.utils.SpringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@Service
public class MainService {

    private Logger logger = LoggerFactory.getLogger(MainService.class);

    public String call(String json) {
        ReceiveParam param = JSON.parseObject(json, ReceiveParam.class);
        String method = param.getMethod();
        if (StringUtils.isNotBlank(method)) {
            logger.info("request to MainService as method = [{}] and args = [{}]", param.getMethod(), null == param.getArgs() ? "" : param.getArgs().toString());
            try {
                Class clazz = null;
                Object clazzObj = null;
                if (method.startsWith(Methods.book.toString())) {
                    clazz = BookService.class;
                    clazzObj = SpringUtils.getBean(BookService.class);
                } else if (method.startsWith(Methods.booktype.toString())) {

                } else if (method.startsWith(Methods.sysuser.toString())) {
                    clazz = SysUserService.class;
                    clazzObj = SpringUtils.getBean(SysUserService.class);
                } else if (method.startsWith(Methods.sysmenu.toString())) {
                    clazz = SysMenuService.class;
                    clazzObj = SpringUtils.getBean(SysMenuService.class);
                }
                method = method.substring(method.lastIndexOf("_") + 1, method.length());
                Method m = null;
                if (null != param.getArgs()) {
                    m = clazz.getDeclaredMethod(method, Map.class);
                    return (String) m.invoke(clazzObj, param.getArgs());
                } else {
                    m = clazz.getDeclaredMethod(method);
                    return (String) m.invoke(clazzObj);
                }
            } catch (NoSuchMethodException e) {
                logger.error("找不到[{}]方法！", param.getMethod());
                return new Success(false, e).toString();
            } catch (IllegalAccessException e) {
                logger.error("[{}]方法非public方法！", param.getMethod());
                return new Success(false, e).toString();
            } catch (InvocationTargetException e) {
                logger.error("[{}]方法内异常：{}", param.getMethod(), e.getMessage());
                return new Success(false, e).toString();
            }
        }
        return new Success(false).toString();
    }
}
