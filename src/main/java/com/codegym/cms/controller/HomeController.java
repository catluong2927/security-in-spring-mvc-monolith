package com.codegym.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping({ "/","/home"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }

    @GetMapping("/access-denied")
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView("/error-403");
        return modelAndView;
    }

    @GetMapping("/not-found")
    public ModelAndView notFound() {
        ModelAndView modelAndView = new ModelAndView("/error-404");
        return modelAndView;
    }
}
