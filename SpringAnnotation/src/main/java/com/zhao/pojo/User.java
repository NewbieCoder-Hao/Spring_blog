package com.zhao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // 等价于在 beans.xml 文件中注册 bean 实例
public class User {

    // 属性注入，不用提供 set 方法
    @Value("Xiao")  // 等价于 <property name="name" value="Xiao"/>
    public String name = "XiaoMing";
}
