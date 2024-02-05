package TestScripts;

import org.testng.annotations.Test;

public class Customer extends Base
{
	@Test
	public void verify_create_customer() throws InterruptedException
	{
		System.out.println("verify_create_customer");
		Thread.sleep(2000);
	}
	@Test
	public void verify_delete_customer() throws InterruptedException
	{
		System.out.println("verify_delete_customer");
		Thread.sleep(2000);
	}
	@Test
	public void add_project_tothe_customer() throws InterruptedException
	{
		System.out.println("add_project_tothe_customer");
		Thread.sleep(2000);
	}

}
