package com.zhao;

public class Client {

    public static void main(String[] args) {
        // 房东要出租房子
        Host host = new Host();
        // 中介帮房东出租
        Proxy proxy = new Proxy(host);
        // 客户直接找中介
        proxy.rent();
    }

}
