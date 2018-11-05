/*
 * Copyright (C), 2011-2018.
 */
package com.wung;

import com.wung.sample.model.Message;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author wung 2018/11/5.
 */
public class DroolsTest {
	
	@Test
	public void sample() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("ksession-rules");
		
		Message message = new Message();
		message.setMessage("Hello World");
		message.setStatus(Message.HELLO);
		kieSession.insert(message);
		kieSession.fireAllRules();
		
	}
	
}
