package com.brs.model;

import java.time.LocalDateTime;

import com.brs.model.enums.AccountRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private Long id;

    private String emai;

    private String password;

    private String phoneNumber;

    private String firstName;

    private String lastName;

    private String fullName;

    private AccountRole role;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
