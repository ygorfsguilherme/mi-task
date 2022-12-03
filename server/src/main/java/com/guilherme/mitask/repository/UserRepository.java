package com.guilherme.mitask.repository;

import com.guilherme.mitask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
