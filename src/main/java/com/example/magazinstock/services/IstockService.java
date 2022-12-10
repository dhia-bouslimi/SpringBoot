package com.example.magazinstock.services;

import com.example.magazinstock.entity.stock;

import java.util.List;

public interface IstockService {

    public List<stock> retrieveAllStocks();

    public stock addStock(stock s);

    public stock updateStock(stock u);

    public stock retrieveStock(Long id);


    String retrieveStatusStock();

}
