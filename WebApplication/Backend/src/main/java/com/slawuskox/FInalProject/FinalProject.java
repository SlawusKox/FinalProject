package com.slawuskox.finalproject;

import com.slawuskox.finalproject.model.Role;
import com.slawuskox.finalproject.model.User;
import com.slawuskox.finalproject.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalProject {

    public static void main(String[] args) {
        SpringApplication.run(FinalProject.class, args);
    }


    /*CommandLineRunner run(UserService userService) {
        return args -> {
          userService.saveUser(new User(null, "test_uuid", "Spearow123", "zGy21Hf", 0, false, null, null));
          userService.saveRole(new Role(null, "ADMIN"));
          userService.addRoleToUser("Spearow123", "ADMIN");
        };
    }*/
}
