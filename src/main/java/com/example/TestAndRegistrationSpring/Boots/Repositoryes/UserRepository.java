package com.example.TestAndRegistrationSpring.Boots.Repositoryes;

import com.example.TestAndRegistrationSpring.Boots.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
