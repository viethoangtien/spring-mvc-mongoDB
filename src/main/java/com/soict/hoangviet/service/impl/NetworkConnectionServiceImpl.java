package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.INetworkConnectionDAO;
import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.NetworkConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkConnectionServiceImpl implements NetworkConnectionService {

    @Autowired
    private INetworkConnectionDAO<NetworkConnectionModel> networkConnectionDAO;

    @Override
    public List<NetworkConnectionModel> findAll() {
        return networkConnectionDAO.findAll(NetworkConnectionModel.class, "volatile-networkconnection");
    }

    @Override
    public BaseResponse save(List<NetworkConnectionModel> lists) {
        return networkConnectionDAO.save(lists, NetworkConnectionModel.class, "volatile-networkconnection");
    }
}
