package org.launchcode.MFM.controllers;

import org.launchcode.MFM.models.Login;
import org.launchcode.MFM.models.User;
import org.launchcode.MFM.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
//            return "redirect:view/" + user.getId();

    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(new Login());
        model.addAttribute("heading", "Log In");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute @Valid Login form, Errors errors, HttpServletRequest request, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("heading", "Log In");
            return "login";
        }

        User user = userDao.findByUsername(form.getUsername());
        String password = form.getPassword();

        if (user == null) {
            errors.rejectValue("username", "user.invalid", "The given username does not exist");
            return "login";
        }

        if (!user.isMatchingPassword(password)) {
            errors.rejectValue("password", "password.invalid", "Invalid password");
            return "login";
        }

//        setUserInSession(request.getSession(), user);

        return "redirect:/";
    }

//    private void setUserInSession(HttpSession session, User user) {
//    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/";
    }

    }






