package com.soict.hoangviet.dao;

import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface IGenericDAO<T> {
    List<T> findAll(Class<T> clazz, String collectionName);
    BaseResponse save(List<T> lists, Class<T> clazz, String collectionName);
}
