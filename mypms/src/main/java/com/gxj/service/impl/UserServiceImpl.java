package com.gxj.service.impl;

import com.gxj.mapper.UserMapper;
import com.gxj.pojo.User;
import com.gxj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {

        User loginUser = userMapper.login(user.getUsername());

        if(loginUser==null){
            throw new RuntimeException("没有该用户");
        }

        if(!loginUser.getPassword().equals(user.getPassword())){
            throw new RuntimeException("登陆用户或密码错误");
        }

        return loginUser;

    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
