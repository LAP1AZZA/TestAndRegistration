package com.example.TestAndRegistrationSpring.Boots.Repositoryes;

import com.example.TestAndRegistrationSpring.Boots.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
