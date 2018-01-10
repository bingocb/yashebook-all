package com.yashebook.controller;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.rpc.RPCServiceClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by binchen on 2018/1/4.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        ReceiveParam receive = new ReceiveParam();
        receive.setMethod("book_find");//book:实体名    _:分隔符    find:方法名
        Map<String, Object> map = new HashMap<>();
        map.put("book_id", "1231231");
        receive.setArgs(map);
        String json = JSON.toJSONString(receive);
        String result = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        Map<String, Object> resMap = JSON.parseObject(result, HashMap.class);
        return resMap.get("book").toString();
    }
}
