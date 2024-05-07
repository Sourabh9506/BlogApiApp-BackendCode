package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
