package com.how2java.test;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.pojo.A;
import com.how2java.pojo.B;
import com.how2java.pojo.C;

 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class TestSpring {
	   @InjectMocks
	   @Autowired
	   A a;
	   
	   @InjectMocks
	   @Autowired
	   B b;
	 
	   @Mock
	   C c;
	   
	   
	 
	   @Before
	   public void myBefore() {
	       MockitoAnnotations.initMocks(this);
	   }

 
    @Test
    public void test(){
    	PowerMockito.when(c.getValue()).thenReturn(666);
        System.out.println(a.getValue());
    }
}