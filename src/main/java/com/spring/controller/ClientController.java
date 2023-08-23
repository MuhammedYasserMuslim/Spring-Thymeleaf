package com.spring.controller;


import com.spring.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientServices clientServices;

    @RequestMapping("/name")
    public String getName(Model model){
       String name = clientServices.getClient(1).getName();
        model.addAttribute("na",clientServices.getAllClients());
        return "home";
    }

}
