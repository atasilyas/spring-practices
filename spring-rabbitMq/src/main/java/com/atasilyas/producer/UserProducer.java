package com.atasilyas.producer;

import com.atasilyas.model.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProducer {

  @Autowired private RabbitTemplate rabbitTemplate;

  public void sendUser(User user) {
    System.out.println("user sent :" + user.getUsername());
    rabbitTemplate.convertAndSend("router", user);
  }
}
