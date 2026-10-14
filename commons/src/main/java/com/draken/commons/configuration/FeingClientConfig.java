package com.draken.commons.configuration;

import com.draken.commons.clients.FeingErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeingClientConfig {

    @Bean
    ErrorDecoder errorDecoder(){
        return new FeingErrorDecoder();
    }
}
