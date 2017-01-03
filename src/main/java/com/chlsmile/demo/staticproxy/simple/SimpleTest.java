package com.chlsmile.demo.staticproxy.simple;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class SimpleTest {

    public static void main(String[] args) {
        UserService userService=new UserServiceProxy(new UserServiceImpl());
        userService.addUser();
    }

}
