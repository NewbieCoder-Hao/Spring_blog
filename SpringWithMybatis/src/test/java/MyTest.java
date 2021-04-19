import com.zhao.mapper.UserMapper;
import com.zhao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zhao.pojo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void testMybatis() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.selectAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void testMybatisSpring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> userList = mapper.selectAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
