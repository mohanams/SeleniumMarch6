package day8;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class LearnTestNG {
	
	@Test(priority = 1)
	public void signin()
	{
		Assert.assertEquals(1, 0);
		System.out.println("This is Sign in method");
	}
	
	@Test(priority = 2, dependsOnMethods = "signin")
	public void sendmail()
	{
		System.out.println("This is sendmail method");
	}
	
	@Test (priority = 3, dependsOnMethods = "signin")
	public void signout()
	{
		System.out.println("This is Sign out method");
	}

}
