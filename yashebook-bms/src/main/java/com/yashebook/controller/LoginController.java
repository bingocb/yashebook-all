package com.yashebook.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.rpc.RPCServiceClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangsheng on 2018/1/11.
 */
@Controller
@Api(value = "测试Swagger2",description="简单的API")
public class LoginController {

    @RequestMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String index(){

        return "sys/index";
    }
    @ResponseBody
    @RequestMapping("/findMenu")
    public String findMenu(){
        ReceiveParam param = new ReceiveParam();
        param.setMethod("sysmenu_findMenuJsonData");
        String json = JSON.toJSONString(param);
        String result = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        JSONObject jsonObj = JSONObject.parseObject(result);
        if(jsonObj.getBoolean("success")){
            return jsonObj.get("entity").toString();
        }
        return "sys/index";
    }
}
