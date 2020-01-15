package com.soict.hoangviet.controller.admin;

import com.soict.hoangviet.constant.SystemConstant;
import com.soict.hoangviet.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class HomeController {
    @Autowired
    private BrowserHistoryService browserHistoryService;

    @Autowired
    private ComputerConfiguarationService computerConfiguarationService;

    @Autowired
    private FileSystemService fileSystemService;

    @Autowired
    private NetworkConnectionService networkConnectionService;

    @Autowired
    private RecentFileService recentFileService;

    @Autowired
    private SystemEventLogService systemEventLogService;

    @RequestMapping(value = "/admin-home", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("admin/home");
        HashMap<String, Integer> map = new HashMap<>();
        map.put(SystemConstant.NETWORK_CONNECTION, networkConnectionService.countAll());
        map.put(SystemConstant.BROWSER_HiSTORY, browserHistoryService.countAll());
        map.put(SystemConstant.FILE_SYSTEM, fileSystemService.countAll());
        map.put(SystemConstant.COMPUTER_CONFIGUARATION, computerConfiguarationService.countAll());
        map.put(SystemConstant.RECENT_FILE, recentFileService.countAll());
        map.put(SystemConstant.SYSTEM_EVENT_LOG, systemEventLogService.countAll());
        modelAndView.addObject(SystemConstant.MAP, map);
        return modelAndView;
    }
}
