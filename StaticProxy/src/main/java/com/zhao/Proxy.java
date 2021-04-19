package com.zhao;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        see();
        host.rent();
        sign();
        fee();
    }

    // 租房中介要做的额外事务

    public void see() {
        System.out.println("带看房子");
    }

    public void sign() {
        System.out.println("签合同");
    }

    public void fee() {
        System.out.println("收房租");
    }
}
