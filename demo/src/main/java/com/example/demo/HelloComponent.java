package com.example.demo;

import org.springframework.stereotype.Component;

// 가장 기본적인 Bean 객체
@Component // Bean 객체로 등록
public class HelloComponent {
  public void sayHello() {
    System.out.println("Hello Spring Boot!");
  }
}
