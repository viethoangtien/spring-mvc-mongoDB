package com.soict.hoangviet.service.impl;


import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.MongoUserDetails;
import com.soict.hoangviet.model.UserModel;
import com.soict.hoangviet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userService.findOneByUsernameAndStatus(username, SystemConstant.STATUS_ACTIVE);
        if (user == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String authority : user.getAuthorities()) {
            authorities.add(new SimpleGrantedAuthority(authority));
        }
        MongoUserDetails mongoUserDetails = new MongoUserDetails();
        mongoUserDetails.setUsername(user.getUsername());
        mongoUserDetails.setPassword(user.getPassword());
        mongoUserDetails.setAuthorities(authorities);
        mongoUserDetails.setStatus(user.getStatus());
        return mongoUserDetails;
    }
}
