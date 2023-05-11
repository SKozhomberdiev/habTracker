package com.habit.tracker.app.controllers;

import com.habit.tracker.app.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class ProfileController {
    @GetMapping()
    public String index(){
        return "index";
    }
    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("person", new User());
        return "newUser";
    }

}
