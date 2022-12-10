package com.example.magazinstock.repositories;

import com.example.magazinstock.entity.facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface factureRepository extends JpaRepository<facture,Long> {
}
