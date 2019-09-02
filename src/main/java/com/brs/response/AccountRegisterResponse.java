package com.brs.response;

import com.brs.model.AccountRegister;
import com.brs.model.enums.AccountRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRegisterResponse {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private AccountRole role;

    public static final AccountRegisterResponse fromModel(AccountRegister account) {
        AccountRegisterResponse response = new AccountRegisterResponse();
        response.setId(account.getId());
        response.setEmail(account.getEmail());
        response.setFirstName(account.getFirstName());
        response.setLastName(account.getLastName());
        response.setRole(account.getRole());

        return response;
    }
}
