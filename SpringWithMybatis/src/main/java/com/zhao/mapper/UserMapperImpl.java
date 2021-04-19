package com.zhao.mapper;

import java.util.List;
import com.zhao.pojo.*;
import org.apache.ibatis.session.SqlSession;

public class UserMapperImpl implements UserMapper {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectAllUsers() {
        return sqlSession.getMapper(UserMapper.class).selectAllUsers();
    }
}
