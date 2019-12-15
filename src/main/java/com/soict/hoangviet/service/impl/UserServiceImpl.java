package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IUserDAO;
import com.soict.hoangviet.model.UserModel;
import com.soict.hoangviet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDAO<UserModel> userDAO;

    @Override
    public UserModel findOneByUsernameAndStatus(String username, int status) {
        return userDAO.findOneByUsernameAndStatus(username,status);
    }
}
