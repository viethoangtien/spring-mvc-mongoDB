package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.ISystemEventLogDAO;
import com.soict.hoangviet.model.SystemEventLog;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.SystemEventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemEventLogServiceImpl implements SystemEventLogService {

    @Autowired
    private ISystemEventLogDAO<SystemEventLog> systemEventLogDAO;

    @Override
    public List<SystemEventLog> findAll() {
        return systemEventLogDAO.findAll(SystemEventLog.class, "nonVolatile-systemEventLog");
    }

    @Override
    public BaseResponse save(List<SystemEventLog> lists) {
        return systemEventLogDAO.save(lists, SystemEventLog.class, "nonVolatile-systemEventLog");
    }
}
