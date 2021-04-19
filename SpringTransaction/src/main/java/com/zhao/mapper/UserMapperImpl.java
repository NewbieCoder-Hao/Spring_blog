package com.zhao.mapper;

import com.zhao.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectAllUsers() {
        User user = new User(10, "test", "testPwd");
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.addUser(user);
        userMapper.deleteUser(10);

        return userMapper.selectAllUsers();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(10);
    }
}
