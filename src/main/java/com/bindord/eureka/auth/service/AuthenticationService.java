package com.bindord.eureka.auth.service;

import com.bindord.eureka.auth.advice.CustomValidationException;
import com.bindord.eureka.auth.advice.NotFoundValidationException;
import com.bindord.keycloak.auth.model.UserLogin;
import com.bindord.keycloak.auth.model.UserToken;
import reactor.core.publisher.Mono;

public interface AuthenticationService {

    Mono<UserToken> doAuthenticate(UserLogin user) throws CustomValidationException, NotFoundValidationException;
}
