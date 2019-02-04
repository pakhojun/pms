package com.gxj.service;

import com.gxj.pojo.User;

public interface UserService {

    /**
     * 登陆校验
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 更新
     * @param user
     */
    public void update(User user);
}
