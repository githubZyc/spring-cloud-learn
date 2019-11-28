package com.spring.cloud.server.config.controller;

import com.spring.cloud.server.config.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ZhengYanChuang
 * @Date: 2019/11/26 15:28
 * @Description:
 */
@RestController
@EnableConfigurationProperties(UserEntity.class)
public class UserController {
    @Autowired
    private UserEntity userEntity;

    @GetMapping("/get/user")
    public UserEntity userEntity(){
        return userEntity;
    }
}
