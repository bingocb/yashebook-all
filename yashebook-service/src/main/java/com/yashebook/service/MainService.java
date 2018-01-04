package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.domain.mapper.BookMapper;
import com.yashebook.domain.po.Book;
import com.yashebook.enums.Methods;
import com.yashebook.utils.SpringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@Service
public class MainService {

    private Logger logger = LoggerFactory.getLogger(MainService.class);

    @Autowired
    private BookMapper bookMapper;

    public String call(String json) {
        ReceiveParam param = JSON.parseObject(json, ReceiveParam.class);
        String method = param.getMethod();
        if (StringUtils.isNotBlank(method)) {
            logger.info("request to MainService as method = [{}] and args = [{}]", param.getMethod(), null == param.getArgs() ? "" : param.getArgs().toString());
            try {
                Class clazz = null;
                Object clazzObj = null;
                if (method.startsWith(Methods.book.toString())) {
                    clazz = MainService.class;
                    clazzObj = SpringUtils.getBean(MainService.class);
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
//                return error("break", "e1", "NoSuchMethodException");
            } catch (IllegalAccessException e) {
                logger.error("[{}]方法非public方法！", param.getMethod());
//                return error("break", "e2", "IllegalAccessException");
            } catch (InvocationTargetException e) {
                logger.error("[{}]方法内异常：{}", param.getMethod(), e.getMessage());
//                return error("break", "e3", "InvocationTargetException");
            }
        }
        return "";
    }

    public String list(){
        Book book =  bookMapper.selectByPrimaryKey("2342424");
        Map<String, Object> map = new HashMap<>();
        map.put("book_list", book.toString());
        return JSON.toJSONString(map);
    }
}
