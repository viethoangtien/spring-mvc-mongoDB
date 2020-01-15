package com.soict.hoangviet.service.impl;

import com.soict.hoangviet.dao.IFileSystemDAO;
import com.soict.hoangviet.model.FileSystem;
import com.soict.hoangviet.network.response.BaseResponse;
import com.soict.hoangviet.service.FileSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileSystemServiceImpl implements FileSystemService {
    @Autowired
    private IFileSystemDAO<FileSystem> fileSystemDAO;
    @Override
    public List<FileSystem> findAll() {
        return fileSystemDAO.findAll(FileSystem.class, "nonVolatile-fileSystem");
    }

    @Override
    public BaseResponse save(List<FileSystem> lists) {
        return fileSystemDAO.save(lists, FileSystem.class, "nonVolatile-fileSystem");
    }

    @Override
    public int countAll() {
        return findAll().size();
    }
}
