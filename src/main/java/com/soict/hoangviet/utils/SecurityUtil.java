package com.soict.hoangviet.utils;

import com.soict.hoangviet.model.MongoUserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.List;

public class SecurityUtil {

    public static MongoUserDetails getPrincipal(){
        MongoUserDetails mongoUserDetails = (MongoUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return mongoUserDetails;
    }

    public static List<String> getAuthorities() {
        List<String> result = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority authority : authorities) {
            result.add(authority.getAuthority());
        }
        return result;
    }
}
