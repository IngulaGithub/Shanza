package com.Framework;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Hardassert {
	
	public void hdat()
	{
		System.out.println("Step:1");
		System.out.println("Step:2");
		Assert.assertEquals(true, false);
		System.out.println("Step:3");
		System.out.println("Step:4");
	}
	
	public void m1()
	{
		String expres="Snehita";
		String actres="Snehita";
		Assert.assertEquals(actres, expres);
	}

}
