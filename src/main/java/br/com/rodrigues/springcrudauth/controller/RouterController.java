package br.com.rodrigues.springcrudauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * MyController
 */
@Controller
public class RouterController {
    @GetMapping(value = "/")
    public String home(@RequestParam String param) {
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(required=false) String param) {
        return "login";
    }

}