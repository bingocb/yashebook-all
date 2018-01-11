package com.yashebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangsheng on 2018/1/11.
 */
@Controller
public class SysUserController {

    @RequestMapping("/userList")
    public String lsit(Model model){

        return "sys/userList";
    }
}
