package com.forMe.silentVoise.controllers;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title" , "Somebody");
        return "againBeach";
    }
    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title" , "Somebody");
        return "blogs/about";
    }
    @GetMapping("/singIn")
    public String singIn(Model model){
        model.addAttribute("title" , "Somebody");
        return "sing in/singIn";
    }
}
