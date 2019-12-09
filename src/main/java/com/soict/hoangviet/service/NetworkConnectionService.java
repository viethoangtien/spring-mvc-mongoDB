package com.soict.hoangviet.service;

import com.soict.hoangviet.model.NetworkConnectionModel;

import java.util.List;

public interface NetworkConnectionService {
    List<NetworkConnectionModel> findAll();

    List<NetworkConnectionModel> save(List<NetworkConnectionModel> lists);
}
