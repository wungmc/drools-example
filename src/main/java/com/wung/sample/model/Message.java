/*
 * Copyright (C), 2011-2018.
 */
package com.wung.sample.model;

import lombok.Data;

/**
 * @author wung 2018/11/5.
 */
@Data
public class Message {
	
	public static final int HELLO = 0;
	public static final int GOODBYE = 1;
	
	private String message;
	
	private int status;
	
}
