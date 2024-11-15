package com.project.ecommerce.service;

import com.project.ecommerce.client.MailgunClient;
import com.project.ecommerce.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {
        try {
            SendMailForm form = SendMailForm.builder()
                    .from("USER@no.reply")
                    .to("이메일")
                    .subject("Test email from project")
                    .text("myText")
                    .build();
            ResponseEntity<String> response = mailgunClient.sendEmail(form);
            return response.getBody();
        } catch (Exception e) {
            log.error("Failed to send email: {}", e.getMessage());
            throw new RuntimeException("Email sending failed", e);
        }
    }
}
