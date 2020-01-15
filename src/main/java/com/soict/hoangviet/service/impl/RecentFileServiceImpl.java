package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IRecentFileDAO;
import com.soict.hoangviet.model.RecentFile;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.RecentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecentFileServiceImpl implements RecentFileService {

    @Autowired
    private IRecentFileDAO<RecentFile> recentFileDAO;

    @Override
    public List<RecentFile> findAll() {
        return recentFileDAO.findAll(RecentFile.class,"nonVolatile-recentFile");
    }

    @Override
    public BaseResponse save(List<RecentFile> lists) {
        return recentFileDAO.save(lists, RecentFile.class,"nonVolatile-recentFile");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
