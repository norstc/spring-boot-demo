package com.example.demo.loader;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.StockEntity;
import com.example.demo.repositories.StockRepository;

@Component
public class StockLoader implements ApplicationListener<ContextRefreshedEvent>{

	private StockRepository stockRepository;
	
	private Logger log = Logger.getLogger(StockLoader.class);
	
	@Autowired
	public void setStockRepository(StockRepository stockRepository){
		this.stockRepository = stockRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		StockEntity pfyh = new StockEntity();
		pfyh.setId(1);
		pfyh.setStockCode("600000");
		pfyh.setStockName("浦发银行");
		
		stockRepository.save(pfyh);
		
		log.info("Saved pfyh: " + pfyh.getStockCode());
		
		StockEntity byjc = new StockEntity();
		byjc.setId(2);
		byjc.setStockCode("600004");
		byjc.setStockName("白云机场");
		
		stockRepository.save(byjc);
		
		log.info("saved byjc: " + byjc.getStockCode());
		
		StockEntity dfqc = new StockEntity();
		dfqc.setId(3);
		dfqc.setStockCode("600006");
		dfqc.setStockName("东风汽车");
		
		stockRepository.save(dfqc);
		
		log.info("saved dfqc: " +  dfqc.getStockCode());
		
		
	}
	
}
