package com.afroprogrammer.userAuth.repository;

import com.afroprogrammer.userAuth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
        Role findByName(String username);
}