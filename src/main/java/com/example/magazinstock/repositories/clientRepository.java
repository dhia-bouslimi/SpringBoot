package com.example.magazinstock.repositories;

import com.example.magazinstock.entity.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<client,Long> {
}
