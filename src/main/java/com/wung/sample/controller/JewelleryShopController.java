/*
 * Copyright (C), 2011-2018.
 */
package com.wung.sample.controller;

import com.wung.sample.model.Product;
import com.wung.sample.service.JewelleryShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wung 2018/11/5.
 */
@RestController
public class JewelleryShopController {
	
	@Autowired
	private JewelleryShopService jewelleryShopService;
	
	@GetMapping("/getDiscount")
	public Product getProductDiscount(String type) {
		Product product = new Product();
		product.setType(type);
		return jewelleryShopService.getProductDiscount(product);
	}
	
}
