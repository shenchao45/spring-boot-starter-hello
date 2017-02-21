package com.shenchao.boot.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by shenchao on 2017/2/21.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
