package com.zhao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    // o:返回值, method:调用的方法, objects:参数, o1: 目标对象
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("目标对象 " + o1.getClass().getName() + " 的 " + method.getName() + " 方法被执行了, 返回值是 " + o);
    }
}
