package com.gxj.controller;

import com.gxj.pojo.User;
import com.gxj.service.UserService;
import com.gxj.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 登陆
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public Result login(@RequestBody User user, HttpSession session){

        try {
            User loginUser = userService.login(user);
            session.setAttribute("user",loginUser);
            return new Result(true,"登陆成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"登陆失败");
        }

    }


    /**
     * 显示用户信息
     * @param session
     * @return
     */
    @RequestMapping("/getUserInfo")
    public User getUserInfo(HttpSession session){
        User user = (User) session.getAttribute("user");

        return user;
    }

    /**
     * 更新
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody User user){
        try {
            userService.update(user);
            return new Result(true,"保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"保存失败");
        }
    }

}
