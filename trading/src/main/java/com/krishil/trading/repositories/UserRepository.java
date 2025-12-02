package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
