package com.soict.hoangviet.api.admin;

import com.soict.hoangviet.model.NetworkConnectionModel;
import com.soict.hoangviet.service.NetworkConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiAdminNetworkConnection {

    @Autowired
    private NetworkConnectionService networkConnectionService;

    @PostMapping("api/admin-network-connection")
    public List<NetworkConnectionModel> createNetworkConnection(@RequestBody List<NetworkConnectionModel> lists) {
        return networkConnectionService.save(lists);
//        return lists;
    }
}
