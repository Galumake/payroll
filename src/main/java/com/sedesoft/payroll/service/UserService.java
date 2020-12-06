package com.sedesoft.payroll.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sedesoft.payroll.model.User;
import com.sedesoft.payroll.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);

}
