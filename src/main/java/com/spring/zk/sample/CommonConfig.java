package com.spring.zk.sample;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {


  @Bean
  @LoadBalanced
  RestTemplate lbRestTemplate() {
    return new RestTemplate();
  }


}
