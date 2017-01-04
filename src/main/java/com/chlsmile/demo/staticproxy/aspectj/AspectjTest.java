package com.chlsmile.demo.staticproxy.aspectj;

/**
 * Function:
 * User: chl_smile@163.com
 */
public class AspectjTest {

    public static void main(String[] args) {

        UserService userService=new UserServiceImpl();
        userService.addUser();
    }
}
