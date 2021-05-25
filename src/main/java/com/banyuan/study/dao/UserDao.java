package com.banyuan.study.dao;

import com.banyuan.study.bean.User;

/**
 * @author poi 2021/5/25 22:44
 * @version 1.0
 * 2021/5/25 22:44
 */
public interface UserDao {
    public User selectUserById(Integer id);

    //使用原生参数绑定
    public User selectUserByIdAndPwd(Integer id , String pwd);
}
