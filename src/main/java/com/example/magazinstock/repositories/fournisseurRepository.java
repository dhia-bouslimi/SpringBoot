package com.example.magazinstock.repositories;

import com.example.magazinstock.entity.Produit;
import com.example.magazinstock.entity.fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface fournisseurRepository extends JpaRepository<fournisseur,Long> {
}
