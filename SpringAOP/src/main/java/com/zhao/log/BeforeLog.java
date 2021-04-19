package com.zhao.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    // method:目标对象执行的方法, objects:方法参数, o:目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("目标对象 " + o.getClass().getName() + " 的 " + method.getName() + " 方法将被执行");
    }
}
