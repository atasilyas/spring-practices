package com.atasilyas.aop.controller;

import com.atasilyas.aop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserControler {

  @Autowired
  private  UserService userService;

  @PostMapping("addUser")
  public ResponseEntity<String> addUser(@RequestBody String user) {
    return ResponseEntity.ok(userService.addUser(user));
  }
}
