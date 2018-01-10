package com.yashebook.service;

import com.alibaba.fastjson.JSON;
import com.yashebook.bo.Success;
import com.yashebook.domain.mapper.UserMapper;
import com.yashebook.domain.po.User;
import com.yashebook.domain.po.UserCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by binchen on 2018/1/10.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String findUserByName(Map<String, Object> map) {
        String loginName = map.get("loginName").toString();
        UserCriteria criteria = new UserCriteria();
        UserCriteria.Criteria cri = criteria.createCriteria();
        cri.andLoginNameEqualTo(loginName);

        List<User> users = userMapper.selectByExample(criteria);
        return new Success(true, users).toString();
    }
}
