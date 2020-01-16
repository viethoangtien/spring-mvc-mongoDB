package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IEstablishConnectionDAO;
import com.soict.hoangviet.dao.IFileSystemDAO;
import com.soict.hoangviet.model.EstablishConnection;
import com.soict.hoangviet.model.FileSystem;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.EstablishConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablishConnectionServiceImpl implements EstablishConnectionService {
    @Autowired
    private IEstablishConnectionDAO<EstablishConnection> establishConnectionDAO;
    @Override
    public List<EstablishConnection> findAll() {
        return establishConnectionDAO.findAll(EstablishConnection.class, "volatile-establishConnection");
    }

    @Override
    public BaseResponse save(List<EstablishConnection> lists) {
        return establishConnectionDAO.save(lists, EstablishConnection.class, "volatile-establishConnection");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
