package com.example.demo.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.StockEntity;
import com.example.demo.services.StockService;

@Controller
public class StockController {
	
	private StockService stockService;
	@Autowired
	public void SetStockService(StockService stockService){
		this.stockService = stockService;
	}

	@RequestMapping("stock/{id}")
	public String showStock(@PathVariable Integer id, Model model){
		model.addAttribute("stock",stockService.getStockById(id));
		return "stockShow";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("stock/new")
	public String newStock(Model model){
		model.addAttribute("stock", new StockEntity());
		return "stockForm";
	}
	
	
}
