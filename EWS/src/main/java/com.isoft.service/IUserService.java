package com.isoft.service;

public interface IUserService {

    String login(String uname,String upwd);
    boolean register(String r_uname,String r_upwd,String email);

}
