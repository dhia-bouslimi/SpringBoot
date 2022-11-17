package com.example.magazinstock.services;

import com.example.magazinstock.entity.Produit;
import com.example.magazinstock.entity.fournisseur;
import com.example.magazinstock.entity.rayon;
import com.example.magazinstock.entity.stock;
import com.example.magazinstock.repositories.fournisseurRepository;
import com.example.magazinstock.repositories.produitRepository;
import com.example.magazinstock.repositories.rayonRepository;
import com.example.magazinstock.repositories.stockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IproduitServiceUmp implements IproduitService{

    produitRepository produitRepository;
stockRepository stockRepository;
rayonRepository rayonRepository;
fournisseurRepository fournisseurRepository;

    @Override
    public List<Produit> retrieveAllProduits(){
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock){

        stock stock = stockRepository.findById(idStock).get();
        rayon rayon = rayonRepository.findById(idRayon).get();
        if (rayon!=null&&stock!=null){
            p.setRayon(rayon);
            p.setStock(stock);
            return  produitRepository.save(p);
        }
        return null;
    }

    @Override

    public Produit retrieveProduit(Long id){
        return produitRepository.findById(id).orElse(null);
    }

    @Override

    public void assignProduitToStock(Long idProduit, Long idStock){
        Produit produit =produitRepository.findById(idProduit).orElse(null);
        stock stock =stockRepository.findById(idStock).orElse(null);
if(stock != null && produit != null){
    produit.setStock(stock);
    produitRepository.save(produit);
}
    }

    @Override

    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit produit =produitRepository.findById(produitId).orElse(null);
        fournisseur fournisseur= fournisseurRepository.findById(fournisseurId).orElse(null);
        if(produit != null && fournisseur != null){
            if(produit.getFournisseurs() != null){
                produit.getFournisseurs().add(fournisseur);
            }

       produitRepository.save(produit);
        }

    }

}
