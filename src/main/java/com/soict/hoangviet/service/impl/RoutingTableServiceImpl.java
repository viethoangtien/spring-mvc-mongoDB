package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IRoutingTableDAO;
import com.soict.hoangviet.model.RoutingTable;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.RoutingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutingTableServiceImpl implements RoutingTableService {
    @Autowired
    private IRoutingTableDAO<RoutingTable> routingTableDAO;

    @Override
    public List<RoutingTable> findAll() {
        return routingTableDAO.findAll(RoutingTable.class,"volatile-routingTable");
    }

    @Override
    public BaseResponse save(List<RoutingTable> lists) {
        return routingTableDAO.save(lists, RoutingTable.class,"volatile-routingTable");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
