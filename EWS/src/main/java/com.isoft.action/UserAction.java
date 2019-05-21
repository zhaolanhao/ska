package com.isoft.action;

import com.isoft.service.IUserService;
import com.isoft.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    IUserService userService;
    @RequestMapping("/login.do")
    /*将return的信息按照json的格式输出*/
    @ResponseBody
    public String login(String uname, String upwd) {
        /*硬编码*/
        String str=userService.login(uname,upwd);
        return str;
    }
    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String r_uname, String r_upwd, String email) {
        boolean temp=userService.register(r_uname,r_upwd,email);
        if (temp)
            return "success";
        else
            return "fault";
    }
}
