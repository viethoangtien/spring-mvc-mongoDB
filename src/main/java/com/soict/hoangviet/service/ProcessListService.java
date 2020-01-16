package com.soict.hoangviet.service;

import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.model.ProcessList;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface ProcessListService {
    List<ProcessList> findAll();

    BaseResponse save(List<ProcessList> lists);

    int countAll();
}
