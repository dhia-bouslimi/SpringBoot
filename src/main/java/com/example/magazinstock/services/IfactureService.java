package com.example.magazinstock.services;

import com.example.magazinstock.entity.facture;

import java.util.Optional;

public interface IfactureService {

   public Optional<facture> getFacturesByClient(Long idClient);
}
