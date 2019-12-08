package com.soict.hoangviet.dao;

import com.soict.hoangviet.model.NetworkConnectionModel;

import java.util.List;

public interface IGenericDAO<T> {
    List<T> findAll(Class<T> clazz, String collectionName);
}
