package com.soict.hoangviet.service;

import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.model.RoutingTable;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface RoutingTableService {
    List<RoutingTable> findAll();

    BaseResponse save(List<RoutingTable> lists);

    int countAll();
}
