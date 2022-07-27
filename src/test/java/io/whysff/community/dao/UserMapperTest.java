package io.whysff.community.dao;

import io.whysff.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectById() {

        User user = userMapper.selectById(11);
        System.out.println("user = " + user);
    }

    @Test
    public void testInsert() {

        User user = new User();
        user.setUsername("刘备");
        user.setEmail("liu@126.com");
        user.setType(1);
        user.setCreateTime(new Date());
        user.setPassword("liu");
        user.setSalt("asd");
        int effectedNum = userMapper.insertUser(user);
        System.out.println("effectedNum = " + effectedNum);
    }

    @Test
    public void testUpdate() {

        int effectedNum = userMapper.updatePassword(150, "asd123");
        System.out.println("effectedNum = " + effectedNum);
    }


}
