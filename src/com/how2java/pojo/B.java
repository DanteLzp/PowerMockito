package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class B {
	@Autowired
	C c;
	public int getValue() {
		return c.getValue();
	}

}
