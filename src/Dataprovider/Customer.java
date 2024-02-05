package Dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utility.ExcelRead;

public class Customer 
{
@DataProvider(name="createcustomer")
public Object[][] createcustomer() throws IOException
{
	return new ExcelRead().Readdata();
}
}
