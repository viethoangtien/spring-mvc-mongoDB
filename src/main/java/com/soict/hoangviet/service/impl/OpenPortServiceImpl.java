package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IOpenPortDAO;
import com.soict.hoangviet.model.OpenPort;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.OpenPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenPortServiceImpl implements OpenPortService {
    @Autowired
    private IOpenPortDAO<OpenPort> openPortDAO;

    @Override
    public List<OpenPort> findAll() {
        return openPortDAO.findAll(OpenPort.class,"volatile-openPort");
    }

    @Override
    public BaseResponse save(List<OpenPort> lists) {
        return openPortDAO.save(lists, OpenPort.class,"volatile-openPort");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
