package com.soict.hoangviet.service;

import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.model.OpenPort;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface OpenPortService {
    List<OpenPort> findAll();

    BaseResponse save(List<OpenPort> lists);

    int countAll();
}
