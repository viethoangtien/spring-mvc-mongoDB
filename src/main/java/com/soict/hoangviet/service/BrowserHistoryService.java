package com.soict.hoangviet.service;

import com.soict.hoangviet.model.BrowserHistory;
import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;


public interface BrowserHistoryService {
    List<BrowserHistory> findAll();

    BaseResponse save(List<BrowserHistory> lists);

    int countAll();
}
