package io.whysff.community.service.impl;

import io.whysff.community.dao.UserMapper;
import io.whysff.community.entity.User;
import io.whysff.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
