package com.rahul.foodbasket.service;

import com.rahul.foodbasket.io.UserRequest;
import com.rahul.foodbasket.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
