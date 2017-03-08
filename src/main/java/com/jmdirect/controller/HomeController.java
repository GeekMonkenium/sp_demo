package com.jmdirect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 08/03/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
