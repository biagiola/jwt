package com.redisa.jwt.service;

import com.redisa.jwt.domain.Role;
import com.redisa.jwt.domain.User;

import java.util.List;

public interface UserService {
    User getUser(String username);
    User saveUser(User user);
    List<User> getUsers();
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
}
