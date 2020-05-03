package com.atasilyas.controller;

import com.atasilyas.model.User;
import com.atasilyas.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/{query}")
    public ResponseEntity<List<User>> getAll(@PathVariable String query){
        List<User> userList = userRepository.getByName(query);
        return ResponseEntity.ok(userList);
    }
}
