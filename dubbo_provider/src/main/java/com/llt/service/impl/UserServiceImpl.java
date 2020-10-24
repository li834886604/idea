package com.llt.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.llt.dao.UserDao;
import com.llt.pojo.User;
import com.llt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User findById(Integer id) {

        return userDao.findById(id);
    }
}
