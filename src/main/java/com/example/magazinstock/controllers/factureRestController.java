package com.example.magazinstock.controllers;

import com.example.magazinstock.entity.facture;
import com.example.magazinstock.services.IfactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/facture")
public class factureRestController {

    @Autowired
    IfactureService ifactureService;


    @PostMapping("/getFacturesByClient/{idClient}")
    public Optional<facture> getFacturesByClient(@PathVariable Long idClient) {
       return ifactureService.getFacturesByClient(idClient);
    }


}
