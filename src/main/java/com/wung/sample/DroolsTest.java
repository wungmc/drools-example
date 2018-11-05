/*
 * Copyright (C), 2011-2018.
 */
package com.wung.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author wung 2018/11/5.
 */
public class DroolsTest {
	
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kieContainer = ks.getKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieSession("ksession-rules");
		
		Message message = new Message();
		message.setMessage("Hello World");
		message.setStatus(Message.HELLO);
		kieSession.insert(message);
		kieSession.fireAllRules();
		
	}
	
	public static class Message {
		public static final int HELLO = 0;
		public static final int GOODBYE = 1;
		
		private String message;
		
		private int status;
		
		public String getMessage() {
			return message;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
		
		public int getStatus() {
			return status;
		}
		
		public void setStatus(int status) {
			this.status = status;
		}
	}
}
