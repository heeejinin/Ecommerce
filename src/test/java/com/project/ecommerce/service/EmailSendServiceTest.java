package com.project.ecommerce.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmailSendServiceTest {
    @Autowired
    private EmailSendService emailSendService;

    @Test
    void emailSendTest() {
        assertDoesNotThrow(() -> {
            String response = emailSendService.sendEmail();
            assertNotNull(response);
            System.out.println("Email send response: " + response);
        });
    }
}