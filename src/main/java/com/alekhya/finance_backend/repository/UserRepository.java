package com.alekhya.finance_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alekhya.finance_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
