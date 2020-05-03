package com.atasilyas.helper;

import com.atasilyas.model.User;
import com.atasilyas.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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
        HashMap userSpec = new HashMap();
        userSpec.put("Yas" , 18);
        userSpec.put("Sehir" , "Istanbul");
        userSpec.put("Ilce" , "Muradiye");
        userSpec.put("Bana adi" , "Koroglu");
        user.setOtherSpec(userSpec);
        userRepository.save(user);
    }
}
