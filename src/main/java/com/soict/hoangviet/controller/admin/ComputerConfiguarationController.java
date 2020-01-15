package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.BrowserHistory;
import com.soict.hoangviet.model.ComputerConfiguaration;
import com.soict.hoangviet.service.ComputerConfiguarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ComputerConfiguarationController {
    @Autowired
    private ComputerConfiguarationService computerConfiguarationService;

    @RequestMapping(value = "/admin-computer-configuaration", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/computer-configuaration");
        List<ComputerConfiguaration> model = computerConfiguarationService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
