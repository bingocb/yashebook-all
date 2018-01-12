package com.yashebook.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yashebook.bo.Success;
import com.yashebook.domain.mapper.SysMenuMapper;

import com.yashebook.domain.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by wangsheng on 2018/1/11.
 */
@Service
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    public String findMenuJsonData(){
        SysMenuCriteria criteria = new SysMenuCriteria();
        SysMenuCriteria.Criteria cri = criteria.createCriteria();
        cri.andFIdEqualTo(new Long(0));
        JSONArray res = new JSONArray();
        List<SysMenu> menus = sysMenuMapper.selectByExample(criteria);
        for(int i=0;i<menus.size();i++){
            JSONObject json = new JSONObject();
            json.put("title",menus.get(i).getMenuName());
            json.put("icon",menus.get(i).getMenuIcon());
            if(i==0){
                json.put("spread",true);
            }else{
                json.put("spread",false);
            }
            SysMenuCriteria criteriaP = new SysMenuCriteria();
            SysMenuCriteria.Criteria criP = criteriaP.createCriteria();
            criP.andFIdEqualTo(new Long(menus.get(i).getId()));
            List<SysMenu> menusP = sysMenuMapper.selectByExample(criteriaP);
            if(menusP.size()>0){
                JSONArray resP = new JSONArray();
                for(SysMenu menuP : menusP){
                    JSONObject jsonP = new JSONObject();
                    jsonP.put("title",menuP.getMenuName());
                    jsonP.put("icon",menuP.getMenuIcon());
                    jsonP.put("href",menuP.getMenuUrl());
                    resP.add(jsonP);
                }
                json.put("children",resP);
            }
            res.add(json);
        }
        return new Success(true, res).toString();
    }
}
