package com.example.magazinstock.repositories;

import com.example.magazinstock.entity.client;
import com.example.magazinstock.entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface stockRepository extends JpaRepository<stock,Long> {
}
