package com.soict.hoangviet.service;

import com.soict.hoangviet.model.UserModel;

public interface UserService {
    UserModel findOneByUsernameAndStatus(String username, int status);
}
