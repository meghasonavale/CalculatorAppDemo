package com.cg.maven.demo.CalculateApp;

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;


@SuppressWarnings("deprecation")
public class TestCalculator{
   
	@Test
    public void testAdd()
    {
    	Calculator c1 = new Calculator();
    	int res= c1.add(3, 6);
    	Assert.assertEquals(9, res);
       
    }
	   
		@Test
	    public void testSubtract()
	    {
	    	Calculator c1 = new Calculator();
	    	int res= c1.subtract(10, 6);
	    	Assert.assertEquals(4, res);
	       
	    }
	
		   
		@Test
	    public void testMultiply()
	    {
	    	Calculator c1 = new Calculator();
	    	int res= c1.multiply(3, 6);
	    	Assert.assertEquals(18, res);
	       
	    }
		
		   
		@Test
	    public void testDivide()
	    {
	    	Calculator c1 = new Calculator();
	    	double res= c1.divide(6, 3);
	    	Assert.assertEquals(2, res);
	       
	    }
}
