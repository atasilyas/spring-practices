package com.atasilyas.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAop {

  @Before("execution(* com.atasilyas.aop.service.UserService.addUser(..))")
  public void beforeGetUserMethod(JoinPoint joinPoint) {
    System.out.println("Before getUser method : " + joinPoint.getArgs());
    System.out.println(joinPoint.getSignature());
  }

  @After("execution(* com.atasilyas.aop.service.*.*(..))")
  public void afterGetUserMethod(JoinPoint joinPoint) {
    System.out.println("After getUser method : " + joinPoint.getArgs());
    System.out.println(joinPoint.getSignature());
  }
}
