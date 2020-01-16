package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IProcessListDAO;
import com.soict.hoangviet.model.ProcessList;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.ProcessListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessListServiceImpl implements ProcessListService {
    @Autowired
    private IProcessListDAO<ProcessList> processListDAO;

    @Override
    public List<ProcessList> findAll() {
        return processListDAO.findAll(ProcessList.class, "volatile-processList");
    }

    @Override
    public BaseResponse save(List<ProcessList> lists) {
        return processListDAO.save(lists, ProcessList.class, "volatile-processList");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
