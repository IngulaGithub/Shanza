package com.Framework;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=2,invocationCount = 3)
		public void contact()
		{
			System.out.println("ccontact created");
		}
		
		@Test(dependsOnMethods = "contact",priority = 3)
		public void modify()
		{
			String me="like";
			System.out.println(me.charAt(5));
			System.out.println("contact modified");
		}
		
		@Test(dependsOnMethods = "modify")
			public void delete()
			{
				System.out.println("contact deleteed");
			}


}
