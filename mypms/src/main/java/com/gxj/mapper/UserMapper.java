package com.gxj.mapper;

import com.gxj.pojo.User;

public interface UserMapper {

    /**
     * 登陆校验
     * @param username
     * @return
     */
    public User login(String username);


    /**
     * 更新
     * @param user
     */
    public void update(User user);
}
