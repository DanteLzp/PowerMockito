package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
B b;
public int getValue() {
	return b.getValue();
}
}