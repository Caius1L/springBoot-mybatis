package com.hangz.spring.mybatis.mapper;

import com.hangz.spring.mybatis.entity.TestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

    TestUser test1(Integer id);

    TestUser test2(@Param("id") Integer id);

    TestUser test3(int id);

    TestUser test21(Integer id);

    TestUser test4(Integer id);
}