package com.yashebook.security;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.bo.ReceiveParam;
import com.yashebook.domain.po.User;
import com.yashebook.rpc.RPCServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangsheng on 2018/1/10.
 */
public class CustomUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ReceiveParam param = new ReceiveParam();
        param.setMethod("user_findUserByName");
        Map<String, Object> map = new HashMap<>();
        map.put("loginName", s);
        param.setArgs(map);
        String json = JSON.toJSONString(param);
        String result = new RPCServiceClient("127.0.0.1", 40313).call("", System.currentTimeMillis() + "", json);
        JSONObject jsonObj = JSONObject.parseObject(result);
        if(jsonObj.getBoolean("success")){
            List list = JSON.parseObject(jsonObj.get("entity").toString(), ArrayList.class);
            User user = JSON.parseObject(list.get(0).toString(), User.class);
            return user;
        }
        return null;
    }
}
