package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IComputerConfiguarationDAO;
import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.ComputerConfiguarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerConfiguarationServiceImpl implements ComputerConfiguarationService {
    @Autowired
    private IComputerConfiguarationDAO<ComputerConfiguaration> computerConfiguarationDAO;

    @Override
    public List<ComputerConfiguaration> findAll() {
        return computerConfiguarationDAO.findAll(ComputerConfiguaration.class,"nonVolatile-computerConfiguaration");
    }

    @Override
    public BaseResponse save(List<ComputerConfiguaration> lists) {
        return computerConfiguarationDAO.save(lists,ComputerConfiguaration.class,"nonVolatile-computerConfiguaration" );
    }
}
