package com.wenjing.mybatis.dao;

import com.wenjing.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Aaron
 * @description
 * @date 2021/5/10 下午5:13
 */
public interface UserMapper {
    User findById(Integer userId);
    int saveUser(User user);
    User findByUser(User user);
    User findByUser2(User user);
}
