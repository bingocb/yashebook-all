package com.yashebook.controller.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.rpc.RPCServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@RestController
public class TestApi {

    @GetMapping(value = "sayHello")
    public String test() {
        Map<String, String> map = new HashMap<>();
        map.put("say", "hello server");
        String json = JSON.toJSONString(map);
        String r = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        JSONObject jsonObj = JSONObject.parseObject(r);
        return jsonObj.getString("say");
    }
}
