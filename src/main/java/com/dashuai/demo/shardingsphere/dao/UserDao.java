package com.dashuai.demo.shardingsphere.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dashuai.demo.shardingsphere.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Da Shuai
 * @since 2020-06-17 15:51
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
