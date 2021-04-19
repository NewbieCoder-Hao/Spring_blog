package com.zhao;


public class Client {

    public static void main(String[] args) {
        Host host = new Host();
        // 代理实例的调用处理程序
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        // 设置真实角色
        handler.setRent(host);
        // 创建动态代理类
        Rent proxy = (Rent) handler.getProxy();

        proxy.rent();

    }
}
