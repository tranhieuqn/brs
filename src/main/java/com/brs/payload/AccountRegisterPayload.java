package com.brs.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.brs.model.enums.AccountRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRegisterPayload {

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotNull
    private AccountRole role;

}
