package com.slawuskox.finalproject.service;

import com.slawuskox.finalproject.model.Role;
import com.slawuskox.finalproject.model.User;
import com.slawuskox.finalproject.repo.RoleRepo;
import com.slawuskox.finalproject.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByRoleName(roleName);

        user.getRoles().add(role);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }
}
