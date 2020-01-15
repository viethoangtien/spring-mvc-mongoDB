package com.soict.hoangviet.service;

import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface NetworkConnectionService {
    List<NetworkConnectionModel> findAll();

    BaseResponse save(List<NetworkConnectionModel> lists);

    int countAll();
}
