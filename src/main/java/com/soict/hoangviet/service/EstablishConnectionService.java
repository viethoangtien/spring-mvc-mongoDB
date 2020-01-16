package com.soict.hoangviet.service;

import com.soict.hoangviet.model.EstablishConnection;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface EstablishConnectionService {
    List<EstablishConnection> findAll();

    BaseResponse save(List<EstablishConnection> lists);

    int countAll();
}
