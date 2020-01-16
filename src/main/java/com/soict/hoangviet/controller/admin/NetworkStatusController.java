package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.EstablishConnection;
import com.soict.hoangviet.model.NetworkStatus;
import com.soict.hoangviet.service.EstablishConnectionService;
import com.soict.hoangviet.service.NetworkStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NetworkStatusController {
    @Autowired
    private NetworkStatusService networkStatusService;

    @RequestMapping(value = "/admin-network-status", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/network-status");
        List<NetworkStatus> model = networkStatusService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
