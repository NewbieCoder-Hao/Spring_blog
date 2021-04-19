package com.zhao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 创建动态代理类，重点注意第二个参数
    // 之前静态代理只代理一个真实角色，而现在是代理接口，所以可以代理一类角色
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        see();
        // 执行代理实例的方法调用，并返回结果
        // 本质利用反射实现
        Object result = method.invoke(rent, args);
        sign();
        fee();
        return result;
    }

    // 代理角色的额外操作

    public void see() {
        System.out.println("带看房");
    }

    public void sign() {
        System.out.println("签合同");
    }

    public void fee() {
        System.out.println("收房租");
    }
}
