package com.brs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brs.model.AccountRegister;

@Repository
public interface AccountRegisterRepository extends JpaRepository<AccountRegister, Long> {

}
