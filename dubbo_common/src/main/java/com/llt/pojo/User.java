package com.llt.pojo;

import java.io.Serializable;

public class User implements Serializable {
//实体类将来要通过远程调用,必须实现序列化
    //如果属性为基础数据类型,要使用它到的包装类(有实现序列话),防止在远程调用过程中数据丢失
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
