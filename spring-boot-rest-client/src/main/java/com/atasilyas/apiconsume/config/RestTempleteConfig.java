package com.atasilyas.apiconsume.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTempleteConfig {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
