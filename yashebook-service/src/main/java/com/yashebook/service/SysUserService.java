package com.yashebook.service;

import com.yashebook.bo.Success;
import com.yashebook.domain.mapper.SysUserMapper;
import com.yashebook.domain.po.SysUser;
import com.yashebook.domain.po.SysUserCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wangsheng on 2018/1/10.
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public String findUserByName(Map<String, Object> map) {
        String username = map.get("username").toString();
        SysUserCriteria criteria = new SysUserCriteria();
        SysUserCriteria.Criteria cri = criteria.createCriteria();
        cri.andUsernameEqualTo(username);

        List<SysUser> users = sysUserMapper.selectByExample(criteria);
        return new Success(true, users).toString();
    }
}
