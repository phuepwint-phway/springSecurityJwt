package com.thineikhaing.springsecurityJwt.repository;

import com.thineikhaing.springsecurityJwt.models.ERole;
import com.thineikhaing.springsecurityJwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}