package com.atasilyas.consumer;

import com.atasilyas.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserConsumer {


  @RabbitListener(queues = "queue")
  public void handleUser(User user) {
    System.out.println("user added");
    System.out.println(user.toString());
  }
}
