package com.isoft.dao.impl;

import com.isoft.dao.IUserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
    @Autowired
    SqlSessionFactory sessionFactoryBean;

    @Override
    public String login(String uname, String upwd) throws Exception {

        SqlSession sqlSession = sessionFactoryBean.openSession(true);//true  开启事务
        String statment = "com.isoft.mapping.userMapper.login";
        Map map = new HashMap();
        map.put("uname", uname);
        map.put("upwd", upwd);
        System.out.println(map);
        List list = sqlSession.selectList(statment, map);
        System.out.println(list);
        if (list != null)
            return "success";
        else
            return "fault";
    }

    @Override
    public boolean register(String r_uname, String r_upwd, String email) {
        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statement = "com.isoft.mapping.userMapper.register";
        Map map = new HashMap();
        map.put("uname", r_uname);
        map.put("upwd", r_upwd);
        map.put("email", email);
        int i = sqlSession.insert(statement, map);
        if (i > 0)
            return true;
        else
            return false;
    }
}
