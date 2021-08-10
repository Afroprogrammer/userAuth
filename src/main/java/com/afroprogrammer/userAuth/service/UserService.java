package com.afroprogrammer.userAuth.service;

import com.afroprogrammer.userAuth.model.AppUser;
import com.afroprogrammer.userAuth.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
