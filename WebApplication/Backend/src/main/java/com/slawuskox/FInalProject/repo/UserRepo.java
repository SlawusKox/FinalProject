package com.slawuskox.finalproject.repo;

import com.slawuskox.finalproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
