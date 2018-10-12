package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getLoginForm(){
        //map.addAttribute("greeting","Welcome to Stackroute!!");
        return "Form";
    }

    @PostMapping("/submit")
    public String getSuccess(ModelMap map , @ModelAttribute("user1") User user1 , BindingResult result){

        //String name = reqpar.get("Name");
        //String password = reqpar.get("Password");
        //map.addAttribute("user1",user1);
        if(result.hasErrors()){
            return "Form";
        }
        map.addAttribute("greeting","   Welcome to Stackroute!!");
        return "index";
    }
}
