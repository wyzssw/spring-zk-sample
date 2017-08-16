package com.spring.zk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringZkSampleApplication {
  
  @Autowired
  private RestTemplate restTemplate;

  public static void main(String[] args) {
    SpringApplication.run(SpringZkSampleApplication.class, args);
  }
  
  @RequestMapping("/home")
  public String home() {
    return "Hello World";
  }
  
  @RequestMapping("/")
  public String goHome() {
    System.out.println(restTemplate.getForObject("http://user/home", String.class));
    return "Go home";
  }
  
}
