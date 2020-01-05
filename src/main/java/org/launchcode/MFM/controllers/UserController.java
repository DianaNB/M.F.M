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
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping(value="")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String addUser(Model model) {
        model.addAttribute(new User());
        model.addAttribute("title", "Register");
        return "/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute @Valid User newUser, Errors errors, String verify) { //String verifyPassword) { model.addAttribute(user);
        model.addAttribute(newUser);
        if (errors.hasErrors()) {
            model.addAttribute("title", "Register");
            return "/register";
        }
        userDao.save(newUser);
        return "/profile";

    }
    @RequestMapping(value="", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("user",  new User());
        model.addAttribute("heading", "Log In");
        return "login";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String login(Model model, @ModelAttribute @Valid User user1, Errors errors, @RequestParam String username) {


//        if (errors.hasErrors()) {
//            model.addAttribute("heading", "Log In");
//            return "login";
//
        User user = userDao.findByUsername(username);
//        String password = form.getPassword();
//
        if (user != null) {
//            errors.rejectValue("username", "user.invalid", "The given username does not exist");
//            return "login";
//        }
//
//        if (!user.isMatchingPassword(password)) {
//            errors.rejectValue("password", "password.invalid", "Invalid password");
//            return "login";
//        }


            return "redirect:/profile";
        }
        return "profile";

//    private void setUserInSession(HttpSession session, User user) {
//    }
    }
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "/";
    }

    }






