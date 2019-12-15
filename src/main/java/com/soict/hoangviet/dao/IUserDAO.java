package com.soict.hoangviet.dao;

public interface IUserDAO<T> extends IGenericDAO<T> {
    T findOneByUsernameAndStatus(String username, int status);
}
