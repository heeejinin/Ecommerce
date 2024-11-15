package com.project.ecommerce.service;

import com.project.ecommerce.domain.SignUpForm;
import com.project.ecommerce.domain.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService service;


    @Test
    void signUp() {
        SignUpForm form = SignUpForm.builder()
                .name("name")
                .birth(LocalDate.now())
                .email("abc@gmail.com")
                .password("1")
                .phone("01000000000")
                .build();
        Customer c = service.signUp(form);
        // getId를 했을 때 null 값이 아니라면
        assertNotNull(c.getId());

    }
}