package com.fun.time.service;

import com.fun.time.model.User;

public interface IAuthenticationService {
	User signInAndReturnJWT(User signInRequest);
}
