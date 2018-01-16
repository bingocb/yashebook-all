package com.yashebook.controller;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.rpc.RPCServiceClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangsheng on 2018/1/11.
 */
@Controller
public class SysUserController {

    @RequestMapping("/userList")
    public String lsit(Model model){

        return "sys/userList";
    }

    @ResponseBody
    @RequestMapping(value = "/getPage", method = RequestMethod.GET)
    public String getPage(String pageIndex, String pageSize) {
        ReceiveParam param = new ReceiveParam();
        param.setMethod("sysuser_findList");
        Map<String, Object> map = new HashMap<>();
        map.put("pageIndex", pageIndex);
        map.put("pageSize", pageSize);
        param.setArgs(map);
        String json = JSON.toJSONString(param);
        String r = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        return r;
    }

    @RequestMapping("/userForm")
    public String userForm(Model model){

        return "sys/userForm";
    }
}
