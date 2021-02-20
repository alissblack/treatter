package com.github.alissblack.treatter.repos;

import com.github.alissblack.treatter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
