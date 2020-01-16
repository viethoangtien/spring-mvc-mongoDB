package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.model.ProcessList;
import com.soict.hoangviet.model.RoutingTable;
import com.soict.hoangviet.service.ProcessListService;
import com.soict.hoangviet.service.RoutingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RoutingTableController {
    @Autowired
    private RoutingTableService routingTableService;

    @RequestMapping(value = "/admin-routing-table", method = RequestMethod.GET)
    public ModelAndView networkConnectionPage() {
        ModelAndView modelAndView = new ModelAndView("admin/routing-table");
        List<RoutingTable> model = routingTableService.findAll();
        modelAndView.addObject(SystemConstant.MODEL, model);
        return modelAndView;
    }
}
