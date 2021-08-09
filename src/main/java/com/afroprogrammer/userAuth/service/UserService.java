package com.afroprogrammer.userAuth.service;

import com.afroprogrammer.userAuth.model.AppUser;
import com.afroprogrammer.userAuth.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
