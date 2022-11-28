package com.ibirds.springdemoone.Service;

import com.ibirds.springdemoone.model.User;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  User createUser(User user);

  List<User> getAllUsers();

  User findById(UUID id) throws Exception;
}
