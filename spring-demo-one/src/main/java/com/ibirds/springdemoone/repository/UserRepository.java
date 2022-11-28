package com.ibirds.springdemoone.repository;

import com.ibirds.springdemoone.model.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {}
