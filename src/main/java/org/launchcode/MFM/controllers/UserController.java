package org.launchcode.MFM.controllers;

import org.launchcode.MFM.models.User;
import org.launchcode.MFM.models.data.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping(value="")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("title", "Register");
        return "/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute @Valid User newUser, Errors errors) { //String verifyPassword) { model.addAttribute(user);
        if (errors.hasErrors()) {
//            model.addAttribute("verifyPasswordError", "Passwords must match");
            return "/register";
        }
        return "redirect:";
//        } else {
//            userDao.save(user);
//            int id = user.getId();
//
//            return "redirect:view/" + id;s
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }
}

