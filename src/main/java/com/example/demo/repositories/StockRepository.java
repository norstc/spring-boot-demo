package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.StockEntity;

public interface StockRepository extends CrudRepository<StockEntity,Integer>{
	
}
