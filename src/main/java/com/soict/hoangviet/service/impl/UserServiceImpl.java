package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.model.UserModel;
import com.soict.hoangviet.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserModel findOneByUsernameAndStatus(String username, int status) {
        return null;
    }
}
