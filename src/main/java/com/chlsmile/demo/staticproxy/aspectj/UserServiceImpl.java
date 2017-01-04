package com.chlsmile.demo.staticproxy.aspectj;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class UserServiceImpl implements UserService {

    public void addUser() {
        System.out.println("addUser方法执行了 Aspectj ...");
    }

    public void delUser(){
        System.out.println("delUser方法执行了 Aspectj ...");
    }
}
