package com.brs.service;

import com.brs.payload.AccountRegisterPayload;
import com.brs.response.AccountRegisterResponse;

public interface AccountRegisterService {

    AccountRegisterResponse register(AccountRegisterPayload payload);

}
