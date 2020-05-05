package com.atasilyas.controller;

import com.atasilyas.model.User;
import com.atasilyas.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("getUser")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }


    @PostMapping("addUser")
    public ResponseEntity<User> add(@Valid  @RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
 }
