package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by binchen on 2017/12/25.
 */
@Service
public class MainService {

    public String call(String json) {
        JSONObject jsonObj = JSONObject.parseObject(json);
        System.out.println("client say:"+jsonObj.getString("say"));
        Map<String, String> map = new HashMap<>();
        map.put("say", "Hi Client");
        String r = JSON.toJSONString(map);
        return r;
    }
}
