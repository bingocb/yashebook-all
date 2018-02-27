package com.yashebook.controller.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.domain.po.Book;
import com.yashebook.domain.po.User;
import com.yashebook.rpc.RPCServiceClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@RestController
@Api(value = "测试Swagger2API", description = "简单测试")
public class TestApi {

    @GetMapping(value = "sayHello")
    public String test() {
        ReceiveParam param = new ReceiveParam();
        param.setMethod("book_bookList");
        /*Map<String, Object> map = new HashMap<>();
        map.put("say", "hello server");
        param.setArgs(map);*/
        String json = JSON.toJSONString(param);
        String r = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        return r;
    }

    @ApiOperation(value = "根据用户名查询用户", notes = "")
    @ApiImplicitParam(name = "loginName", value = "用户名", paramType = "path", dataType = "String")
    @GetMapping(value = "/findUser/{loginName}")
    public String findUserByName(@PathVariable String loginName) {
        ReceiveParam param = new ReceiveParam();
        param.setMethod("user_findUserByName");
        Map<String, Object> map = new HashMap<>();
        map.put("loginName", loginName);
        param.setArgs(map);
        String json = JSON.toJSONString(param);
        String r = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        JSONObject jsonObj = JSONObject.parseObject(r);
        String entity = jsonObj.getString("entity");
        List<User> users = JSON.parseArray(entity, User.class);
        return users.get(0).toString();
    }
}
