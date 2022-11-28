package com.ibirds.springdemoone.Controller;

import com.ibirds.springdemoone.Service.UserService;
import com.ibirds.springdemoone.model.User;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  // @GetMapping
  // public String sayHello() {
  //   return "Hello World";
  // }

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{id}")
  public User getUserById(@PathVariable UUID id) throws Exception {
    return userService.findById(id);
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }
}
