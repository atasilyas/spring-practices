package com.atasilyas.aop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

  public String addUser(String user) {
    System.out.println("After aop service before method :" + user);
    return user;
  }
}
