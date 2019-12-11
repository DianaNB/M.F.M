package org.launchcode.MFM.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MFMController {

    @RequestMapping(value = "/music")
    public String index(Model model) {return "login";}
}
//TODO create more controllers @RequestMapping