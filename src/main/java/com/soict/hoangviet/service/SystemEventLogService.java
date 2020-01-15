package com.soict.hoangviet.service;

import com.soict.hoangviet.model.RecentFile;
import com.soict.hoangviet.model.SystemEventLog;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface SystemEventLogService {
    List<SystemEventLog> findAll();

    BaseResponse save(List<SystemEventLog> lists);

    int countAll();
}
