package com.example.magazinstock.services;

import com.example.magazinstock.entity.client;
import com.example.magazinstock.entity.facture;
import com.example.magazinstock.repositories.clientRepository;
import com.example.magazinstock.repositories.factureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class IfactureServiceUmp implements IfactureService{


    clientRepository clientRepository;
    factureRepository factureRepository;
    @Override
   public Optional<facture> getFacturesByClient(Long idClient) {
       client client = clientRepository.findById(idClient).orElse(null);
if(client != null){

client.getFactures();

}
return factureRepository.findById(idClient);
    }

}
