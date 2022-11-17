package com.example.magazinstock.controllers;

import com.example.magazinstock.entity.client;
import com.example.magazinstock.services.IclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/client")
public class clientRestController {
    @Autowired
    IclientService iclientService;

    @GetMapping("/retrieveAllClients")
    public List<client> retrieveAllClients(){
        return iclientService.retrieveAllClients();
    }

    @PostMapping("/addClient")
    public client addClient(@RequestBody client c){
        return iclientService.addClient(c);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable("id") Long id){
        iclientService.deleteClient(id);
    }


    @RequestMapping(value = "/retrieveClient/{id}")

    public  client retrieveClient(@PathVariable  Long id){
        return iclientService.retrieveClient(id);
    }

}
