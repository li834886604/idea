package com.llt.dao;

import com.llt.pojo.User;

public interface UserDao {
    User findById(Integer id);
}
