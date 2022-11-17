package com.example.magazinstock.services;


import com.example.magazinstock.entity.Produit;

import java.util.List;

public interface IproduitService {


    public List<Produit> retrieveAllProduits();

  public Produit addProduit(Produit p, Long idRayon, Long idStock);

   public Produit retrieveProduit(Long id);


   public void assignProduitToStock(Long idProduit, Long idStock);


    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
