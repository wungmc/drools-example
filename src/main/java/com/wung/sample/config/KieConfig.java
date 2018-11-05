/*
 * Copyright (C), 2011-2018.
 */
package com.wung.sample.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wung 2018/11/5.
 */
@Configuration
public class KieConfig {
	
	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
	
}
