package com.chlsmile.demo.staticproxy.simple;

/**
 * Function:简单的静态代理实现(不需要借助于任务其它类即可实现)
 * User: chl_smile@163.com
 */
public class SimpleTest {

    public static void main(String[] args) {
        UserService userService=new UserServiceProxy(new UserServiceImpl());
        userService.addUser();
    }

}
