package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IBrowserHistoryDAO;
import com.soict.hoangviet.model.BrowserHistory;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.BrowserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrowserHistoryServiceImpl implements BrowserHistoryService {

    @Autowired
    private IBrowserHistoryDAO<BrowserHistory> browserHistoryDAO;

    @Override
    public List<BrowserHistory> findAll() {
        return browserHistoryDAO.findAll(BrowserHistory.class,"nonVolatile-browserHistory");
    }

    @Override
    public BaseResponse save(List<BrowserHistory> lists) {
        return browserHistoryDAO.save(lists,BrowserHistory.class,"nonVolatile-browserHistory");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
