package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.EstablishConnection;
import com.soict.hoangviet.service.EstablishConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EstablishConnectionController {
    @Autowired
    private EstablishConnectionService establishConnectionService;

    @RequestMapping(value = "/admin-establish-connection", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/establish-connection");
        List<EstablishConnection> model = establishConnectionService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
