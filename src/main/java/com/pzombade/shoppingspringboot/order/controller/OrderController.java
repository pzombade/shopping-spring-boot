package com.pzombade.shoppingspringboot.order.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Log
@CrossOrigin("http://localhost:4200")
public class OrderController {

    @GetMapping({"/",""})
    public String info(){

        return "You will see orders here";
    }
}
