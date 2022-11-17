package com.example.magazinstock.controllers;

import com.example.magazinstock.entity.Produit;
import com.example.magazinstock.services.IproduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class produit {
    @Autowired
    IproduitService iproduitService;

    @GetMapping("/retrieveAllProduits")


    public List<Produit> retrieveAllProduits(){
        return iproduitService.retrieveAllProduits();
    }


    @PostMapping("/{idRayon}/{idStock}")
    public Produit addProduit(@RequestBody Produit p,@PathVariable Long idRayon, @PathVariable Long idStock){
        return iproduitService.addProduit(p,idRayon,idStock);
    }

    @RequestMapping(value = "/retrieveProduit/{id}")
    public Produit retrieveProduit(Long id){
        return iproduitService.retrieveProduit(id);
    }
}
