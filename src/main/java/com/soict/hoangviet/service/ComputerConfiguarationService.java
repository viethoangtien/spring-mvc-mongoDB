package com.soict.hoangviet.service;

import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface ComputerConfiguarationService {
    List<ComputerConfiguaration> findAll();

    BaseResponse save(List<ComputerConfiguaration> lists);

    int countAll();
}
