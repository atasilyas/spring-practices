package com.atasilyas.helper;

import com.atasilyas.model.User;
import com.atasilyas.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;

@Component
@RequiredArgsConstructor
public class FirstInit {

    private final UserRepository userRepository;

    @PostConstruct
    public void  init(){
        User user = new User();
        user.setName("ilyas");
        user.setSName("Atas");
        user.setAddress("test");
        user.setBirthDate(new Date());
        userRepository.save(user);
    }
}

