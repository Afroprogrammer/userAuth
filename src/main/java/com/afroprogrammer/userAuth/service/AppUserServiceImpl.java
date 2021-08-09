package com.afroprogrammer.userAuth.service;

import com.afroprogrammer.userAuth.model.AppUser;
import com.afroprogrammer.userAuth.model.Role;
import com.afroprogrammer.userAuth.repository.RoleRepo;
import com.afroprogrammer.userAuth.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor @Transactional @Slf4j

public class AppUserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private RoleRepo roleRepo;

    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving new user {} to the database", user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        log.info("Adding  new role name {} to the user name {} ", role.getName() , user.getName());
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user {}", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
