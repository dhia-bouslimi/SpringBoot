package com.example.magazinstock.services;

import ch.qos.logback.core.net.server.Client;
import com.example.magazinstock.entity.client;

import java.util.List;

public interface IclientService {
   public List<client> retrieveAllClients();
  public client addClient(client c);

   public void deleteClient(Long id);

    public  client retrieveClient(Long id);
}
