package com.example.magazinstock.repositories;

import com.example.magazinstock.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepository extends JpaRepository<Produit,Long> {
}
