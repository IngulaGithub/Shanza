package com.Framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class Softassert {

	public void stat()
		{
			System.out.println("Step:1");
			System.out.println("Step:2");
			SoftAssert st=new SoftAssert();
			st.assertEquals(true, false);
			System.out.println("Step:3");
			System.out.println("Step:4");
			st.assertAll();
		}
		
		public void m1()
		{
			String expres="Snehita";
			String actres="Snehita";
			Assert.assertEquals(actres, expres);
		}
		

	}


