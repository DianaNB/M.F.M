package org.launchcode.MFM.controllers;

import org.launchcode.MFM.models.User;
import org.launchcode.MFM.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value="search")
public class SearchController {
    @Autowired
    private UserDao userDao;

//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public String search(Model model) {

//        return "/search";
//    }
//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String (Model model, @ModelAttribute @Valid Search) {
//            return "/search";
//        }
}
