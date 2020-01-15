package com.soict.hoangviet.service;

import com.soict.hoangviet.model.BrowserHistory;
import com.soict.hoangviet.model.RecentFile;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface RecentFileService {
    List<RecentFile> findAll();

    BaseResponse save(List<RecentFile> lists);
}
