package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.OpenPort;
import com.soict.hoangviet.model.ProcessList;
import com.soict.hoangviet.service.OpenPortService;
import com.soict.hoangviet.service.ProcessListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProcessListController {
    @Autowired
    private ProcessListService processListService;

    @RequestMapping(value = "/admin-process-list", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/process-list");
        List<ProcessList> model = processListService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
