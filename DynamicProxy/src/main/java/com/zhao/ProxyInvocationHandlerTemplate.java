package com.zhao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandlerTemplate implements InvocationHandler {

    // 真实角色
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 创建动态代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // todo: 执行代理方法之前要做的额外操作
        // 执行代理实例的方法调用，并返回结果
        Object result = method.invoke(target, args);
        // todo: 执行代理方法之后要做的额外操作
        return result;
    }

    // todo: 代理角色的额外操作

}