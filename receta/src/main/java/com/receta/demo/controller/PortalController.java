
package com.receta.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalController {
    
    @GetMapping("/")
    public String mostrarIndex(){
        return "index";
    }
    
}
