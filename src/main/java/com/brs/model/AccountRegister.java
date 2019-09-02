package com.brs.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.brs.model.enums.AccountRegisterStatus;
import com.brs.model.enums.AccountRole;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AccountRegister {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String email;

    @Basic(optional = false)
    private String password;

    @Basic(optional = false)
    private String firstName;

    @Basic(optional = false)
    private String lastName;

    @Basic(optional = false)
    @Enumerated(EnumType.STRING)
    private AccountRole role;

    @Basic(optional = false)
    private AccountRegisterStatus status;

}
