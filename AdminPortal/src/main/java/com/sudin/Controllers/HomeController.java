package com.sudin.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by s-k-ii-p-s on 8/28/17.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "redirect:/home";
    }


    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }


    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }




}
