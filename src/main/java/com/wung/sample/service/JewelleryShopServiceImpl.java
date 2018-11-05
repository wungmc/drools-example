/*
 * Copyright (C), 2011-2018.
 */
package com.wung.sample.service;

import com.wung.sample.model.Product;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wung 2018/11/5.
 */
@Service
public class JewelleryShopServiceImpl implements JewelleryShopService {
	
	@Autowired
	private KieContainer kieContainer;
	
	@Override
	public Product getProductDiscount(Product product) {
		KieSession kieSession = kieContainer.newKieSession("ksession-rules");
		kieSession.insert(product);
		kieSession.fireAllRules();
		kieSession.dispose();
		
		return product;
	}
	
}

