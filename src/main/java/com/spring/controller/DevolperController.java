package com.spring.controller;

import com.spring.model.Devolper;
import com.spring.services.DevolperServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/devolper")
public class DevolperController {

    @Autowired
    private DevolperServices devolperServices;


   // http://localhost:8080/devolper/get
    @GetMapping("/get")
    public List<Devolper> getDevolper(){
        return devolperServices.getAllDevolpers();
    }

    //http://localhost:8080/devolper/getdev?id=
    @GetMapping("/getdev")
    public Devolper getDevolperBID(@RequestParam int id){
        return devolperServices.getDevolperById(id);
    }
}
