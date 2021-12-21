package com.slawuskox.finalproject.service;

import com.slawuskox.finalproject.model.Role;
import com.slawuskox.finalproject.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    List<User> getUsers();
    User getUser(String username);
}
