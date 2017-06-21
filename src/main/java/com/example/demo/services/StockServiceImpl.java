package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StockEntity;
import com.example.demo.repositories.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	private StockRepository stockRepository;
	@Autowired
	public void setStockRepository(StockRepository stockRepository){
		this.stockRepository = stockRepository;
	}

	@Override
	public StockEntity getStockById(Integer id) {
		
		return stockRepository.findOne(id);
	}

}
