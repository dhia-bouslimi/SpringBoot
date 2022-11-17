package com.example.magazinstock.services;

import ch.qos.logback.core.net.server.Client;
import com.example.magazinstock.entity.client;
import com.example.magazinstock.repositories.clientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class IclientServiceUmp implements IclientService{


   clientRepository clientRepository;

    @Override

    public List<client> retrieveAllClients(){
        return clientRepository.findAll();
    }

    @Override
    public client addClient(client c){
        return clientRepository.save(c);
    }

    @Override

    public void deleteClient(Long id){
        clientRepository.deleteById((id));
    }


    @Override
    public  client retrieveClient(Long id){
      return   clientRepository.findById(id).orElse(null);
    }


}
