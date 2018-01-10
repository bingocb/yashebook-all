package com.yashebook.controller.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.domain.po.Book;
import com.yashebook.rpc.RPCServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@RestController
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

    @GetMapping(value = "findUser")
    public String findUserByName() {
        ReceiveParam param = new ReceiveParam();
        param.setMethod("user_findUserByName");
        Map<String, Object> map = new HashMap<>();
        map.put("userName", "Bingo");
        param.setArgs(map);
        String json = JSON.toJSONString(param);
        String r = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        return r;
    }
}
