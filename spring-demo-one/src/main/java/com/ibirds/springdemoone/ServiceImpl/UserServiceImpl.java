package com.ibirds.springdemoone.ServiceImpl;

import com.ibirds.springdemoone.Service.UserService;
import com.ibirds.springdemoone.model.User;
import com.ibirds.springdemoone.repository.UserRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

  // private final UserRepository userRepository;

  @Autowired
  private UserRepository userRepository;

  @Override
  public User createUser(User user) {
    User newUser = new User();

    newUser.setId(UUID.randomUUID());
    newUser.setName(user.getName());
    newUser.setEmail(user.getEmail());
    newUser.setPassword(user.getPassword());

    return userRepository.save(newUser);
  }

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User findById(UUID id) throws Exception {
    return userRepository
      .findById(id)
      .orElseThrow(() -> new Exception("User not found"));
  }
}
