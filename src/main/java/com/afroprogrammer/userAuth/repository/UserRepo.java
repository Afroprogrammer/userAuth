package com.afroprogrammer.userAuth.repository;

import com.afroprogrammer.userAuth.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
