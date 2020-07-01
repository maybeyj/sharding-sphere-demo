package com.dashuai.demo.shardingsphere;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dashuai.demo.shardingsphere.dao.UserDao;
import com.dashuai.demo.shardingsphere.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;
import java.util.UUID;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void add() {
        for (int i = 0; i < 5; i++) {
            User user=new User();
            user.setUuid((long) i);
            user.setName(i+"号用户");
            userDao.insert(user);
        }
    }

    @Test
    void get() {
        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        userQueryWrapper.eq("id",1277564057016180737L)
                .eq("uuid",1L);
        User user = userDao.selectOne(userQueryWrapper);
        System.out.println(user);
    }

}
