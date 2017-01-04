package com.chlsmile.demo.staticproxy.aspectj;

/**
 * Function:
 * User: chl_smile@163.com
 */
public aspect ExcuteTimeAspectj {

    pointcut ExcuteTimePointCut():execution(* com.chlsmile.demo.staticproxy.aspectj.UserServiceImpl.*(..));

    before():ExcuteTimePointCut(){
        System.out.println("记录时间开始 Aspectj ...");
    }

    after():ExcuteTimePointCut(){
        System.out.println("记录时间结束 Aspectj ...");
    }

}
