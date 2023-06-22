package com.Framework;

import org.testng.annotations.Test;

@Test
public class Sample {
	
	//@Test-------->need to write to every method instead of this can write on class
	public void contact()
	{
		System.out.println("ccontact created");
	}
	
	//@Test
	public void modify()
	{
		System.out.println("contact modified");
	}
	
	//@Test
		public void delete()
		{
			System.out.println("contact deleteed");
		}


}
