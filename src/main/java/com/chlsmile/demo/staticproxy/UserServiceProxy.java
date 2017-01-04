package com.chlsmile.demo.staticproxy;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("记录开始时间......");
        userService.addUser();
        System.out.println("记录执行结束时间......");
    }
}
