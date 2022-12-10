package com.example.magazinstock.services;

import com.example.magazinstock.entity.stock;
import com.example.magazinstock.repositories.stockRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class IstockServiceUmp implements IstockService{

   stockRepository stockRepository;


    @Override

    public List<stock> retrieveAllStocks(){
       return stockRepository.findAll();
    }

    @Override
    public stock addStock(stock s){
        return stockRepository.save(s);
    }

    @Override

    public stock updateStock(stock u){
        return stockRepository.save(u);
    }

    @Override

    public stock retrieveStock(Long id){
        return   stockRepository.findById(id).orElse(null);

    }



    @Scheduled(cron = "0 0 22 * * *")
   public String retrieveStatusStock(){

List<stock> stock = stockRepository.findAll();
for (stock stock1 : stock){
    if(stock1.getQteStock() < stock1.getQteMin()) {
        System.out.println("Attention");
    }
}
        return stockRepository.findAll().toString();
    }

}
