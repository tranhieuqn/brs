package com.brs.service.impl;

import static com.brs.model.enums.AccountRegisterStatus.AWAITING_EMAIL_VERIFICATION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.brs.model.AccountRegister;
import com.brs.payload.AccountRegisterPayload;
import com.brs.repository.AccountRegisterRepository;
import com.brs.response.AccountRegisterResponse;
import com.brs.service.AccountRegisterService;

@Service
public class AccountRegisterServiceImpl implements AccountRegisterService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AccountRegisterRepository accountRegisterRepository;

    @Override
    public AccountRegisterResponse register(AccountRegisterPayload payload) {
        AccountRegister account = new AccountRegister();
        account.setEmail(payload.getEmail());
        account.setPassword(passwordEncoder.encode(payload.getPassword()));
        account.setFirstName(payload.getFirstName());
        account.setLastName(payload.getLastName());
        account.setRole(payload.getRole());
        account.setStatus(AWAITING_EMAIL_VERIFICATION);
        AccountRegister persisted = accountRegisterRepository.save(account);

        return  AccountRegisterResponse.fromModel(persisted);
    }

}
