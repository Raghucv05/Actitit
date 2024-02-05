package TestScripts;

import org.testng.annotations.Test;

public class User extends Base
{
	@Test
	public void verify_create_user() throws InterruptedException
	{
		System.out.println("verify_create_user");
		Thread.sleep(2000);
	}
	@Test
	public void verify_delete_user() throws InterruptedException
	{
		System.out.println("verify_delete_user");
		Thread.sleep(2000);
	}
	@Test
	public void add_project_tothe_user() throws InterruptedException
	{
		System.out.println("add_project_tothe_user");
		Thread.sleep(2000);
	}

}
