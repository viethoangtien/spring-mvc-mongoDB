package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.INetworkConnectionDAO;
import com.soict.hoangviet.dao.INetworkStatusDAO;
import com.soict.hoangviet.model.NetworkStatus;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.NetworkConnectionService;
import com.soict.hoangviet.service.NetworkStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkStatusServiceImpl implements NetworkStatusService {
    @Autowired
    private INetworkStatusDAO<NetworkStatus> networkStatusDAO;
    @Override
    public List<NetworkStatus> findAll() {
        return networkStatusDAO.findAll(NetworkStatus.class, "volatile-networkStatus");
    }

    @Override
    public BaseResponse save(List<NetworkStatus> lists) {
        return networkStatusDAO.save(lists, NetworkStatus.class, "volatile-networkStatus");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
