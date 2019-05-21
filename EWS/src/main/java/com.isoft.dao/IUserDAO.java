package com.isoft.dao;

public interface IUserDAO {
    String login(String uname,String upwd) throws Exception;
    boolean register(String r_uname,String r_upwd,String email);
}
