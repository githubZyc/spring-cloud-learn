package com.spring.cloud.server.config.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: ZhengYanChuang
 * @Date: 2019/11/26 14:59
 * @Description:
 */
@ConfigurationProperties("test.user")
public class UserEntity {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
