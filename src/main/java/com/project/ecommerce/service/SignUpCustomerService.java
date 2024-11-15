package com.project.ecommerce.service;

import com.project.ecommerce.domain.SignUpForm;
import com.project.ecommerce.domain.model.Customer;
import com.project.ecommerce.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpCustomerService {

    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form) {
        return customerRepository.save(Customer.from(form));
    }
}
