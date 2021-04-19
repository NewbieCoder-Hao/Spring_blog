package com.zhao;

import com.zhao.pojo.User;
import com.zhao.pojo.UserArgs;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testUser() {
        // 解析 beans.xml 文件 , 生成管理相应的 Bean 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // getBean: 参数为 spring 配置文件中 bean 的 id
        // getBean 之前，Spring 已经创建好了 Java Bean
        User user = (User) context.getBean("user");
        user.show();
    }

    @Test
    public void testUserArgs() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserArgs userArgs = (UserArgs) context.getBean("userArgs");
        userArgs.show();
    }
}
