package com.project.ecommerce.config;

import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Encoder;
import feign.form.FormEncoder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Qualifier(value = "mailgun")
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("api", "apiKey");
    }


    @Bean
    public Encoder encoder() {
        return new FormEncoder();
    }
}
