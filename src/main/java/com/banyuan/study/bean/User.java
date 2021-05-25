package com.banyuan.study.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author poi 2021/5/25 22:39
 * @version 1.0
 * 2021/5/25 22:39
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private Date registTime;

    //无参构造（必备构造二选一）
    public User() {}

    //全参构造（必备构造二选一）
    public User(Integer id, String name, String password, String sex, Date birthday, Date registTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.registTime = registTime;
    }

}
