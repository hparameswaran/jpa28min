package com.harish.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
