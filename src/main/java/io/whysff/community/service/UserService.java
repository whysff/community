package io.whysff.community.service;

import io.whysff.community.dto.UserExecution;
import io.whysff.community.entity.User;

import java.util.Map;

public interface UserService {

    User findUserById(int id);

    Map<String, Object> register(User user);

    int activation(int userId, String code);
}
