package com.brs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brs.payload.AccountRegisterPayload;
import com.brs.response.AccountRegisterResponse;
import com.brs.service.AccountRegisterService;

@RestController
@RequestMapping("/accounts/register")
public class AccountRegisterController {

    @Autowired
    private AccountRegisterService accountRegisterService;

    @PostMapping
    public AccountRegisterResponse register(@Valid @RequestBody AccountRegisterPayload payload) {
        return accountRegisterService.register(payload);
    }

}
