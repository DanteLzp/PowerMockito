package com.how2java.pojo;

import org.springframework.stereotype.Component;

@Component
public class C {
	int value = 2;
	public int getValue() {
		System.out.println("Unaviliable");
		return value;
	}

}
