package com.example.magazinstock.controllers;

import com.example.magazinstock.entity.stock;
import com.example.magazinstock.services.IclientService;
import com.example.magazinstock.services.IstockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/stock")
public class stockController {
    @Autowired
    IstockService istockService;


    @GetMapping("/retrieveAllStocks")

    public List<stock> retrieveAllStocks(){
        return istockService.retrieveAllStocks();
    }


    @PostMapping("/addStock")

    public stock addStock(@RequestBody stock s){
        return istockService.addStock(s);
    }

    @PutMapping("/updateStock")

    public stock updateStock(@RequestBody stock u){
        return istockService.updateStock(u);
    }

    @RequestMapping(value = "/retrieveStock/{id}")

    public stock retrieveStock(@PathVariable Long id){
        return istockService.retrieveStock(id);

    }

}
