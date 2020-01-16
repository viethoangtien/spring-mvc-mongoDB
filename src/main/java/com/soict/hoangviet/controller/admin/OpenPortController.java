package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.NetworkStatus;
import com.soict.hoangviet.model.OpenPort;
import com.soict.hoangviet.service.NetworkStatusService;
import com.soict.hoangviet.service.OpenPortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OpenPortController {
    @Autowired
    private OpenPortService openPortService;

    @RequestMapping(value = "/admin-open-port", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/open-port");
        List<OpenPort> model = openPortService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
