package com.soict.hoangviet.service;

import com.soict.hoangviet.model.FileSystem;
import com.soict.hoangviet.network.response.BaseResponse;

import java.util.List;

public interface FileSystemService {
    List<FileSystem> findAll();

    BaseResponse save(List<FileSystem> lists);

}
