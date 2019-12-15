package com.soict.hoangviet.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.client.model.Filters;
import com.soict.hoangviet.dao.IUserDAO;
import com.soict.hoangviet.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl<T> extends AbstractDAO<T> implements IUserDAO<T> {
    @Override
    public T findOneByUsernameAndStatus(String username, int status) {
        BasicDBObject fields = new BasicDBObject();
        fields.put("name", username);
        fields.put("status", status);
        return getCollection((Class<T>) UserModel.class, "users").find(fields).first();
    }
}
