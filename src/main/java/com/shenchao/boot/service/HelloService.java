package com.shenchao.boot.service;
/**
 * Created by shenchao on 2017/2/21.
 */
public class HelloService {
    private String msg;
    public String sayHello(){
        return "hello ,"+msg;
    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
