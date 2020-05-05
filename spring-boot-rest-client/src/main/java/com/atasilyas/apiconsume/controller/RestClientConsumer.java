package com.atasilyas.apiconsume.controller;

import com.atasilyas.apiconsume.dto.User;
import com.atasilyas.apiconsume.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("restClient")
@RequiredArgsConstructor
public class RestClientConsumer {

    private final UserService userRepository;

//    @Value("${rest.templete.base.path}")
    private  static  String BASE_URL = "http://localhost:8080/user/" ;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getUser")
    public ResponseEntity<List<User>> getUsers(){
        ResponseEntity<List> result = restTemplate.getForEntity(BASE_URL+"getUser", List.class);
        List<User> response = result.getBody();
        System.out.println(result);
        return ResponseEntity.ok(response);
    }

    @PostMapping("addUser")
    public ResponseEntity addUser(@RequestBody User user){
        ResponseEntity<User> result = restTemplate.postForEntity(BASE_URL+"addUser", user, User.class);
        User response = result.getBody();
        System.out.println(result);
        return ResponseEntity.ok(response);
    }


}
