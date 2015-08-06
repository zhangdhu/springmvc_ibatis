package com.zdh.model;

import java.io.Serializable;

/**
 * Created by zhangdh-a on 15-8-6.
 */
public class UserInfo implements Serializable {
    private Integer userId;
    private String userName;
    private Integer age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
