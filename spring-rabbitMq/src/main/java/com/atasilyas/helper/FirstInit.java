package com.atasilyas.helper;


import com.atasilyas.model.User;
import com.atasilyas.producer.UserProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;

@Component
@RequiredArgsConstructor
public class FirstInit {

    private final UserProducer userProducer;

    @PostConstruct
    public void  init(){

        User user = new User();
        user.setUsername("ilyas");
        user.setSurname("Atas");
        user.setBirthDate(new Date());
        user.setDescription("deneme");
        userProducer.sendUser(user);
    }
}
