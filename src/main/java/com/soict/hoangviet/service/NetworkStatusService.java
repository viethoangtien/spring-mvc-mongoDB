package com.soict.hoangviet.service;

import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.model.NetworkStatus;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface NetworkStatusService {
    List<NetworkStatus> findAll();

    BaseResponse save(List<NetworkStatus> lists);

    int countAll();
}
