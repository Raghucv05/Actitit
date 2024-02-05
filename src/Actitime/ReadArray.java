package Actitime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadArray {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("D:\\Raghu_repet\\Excel\\Write2.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		String[][] obj=new String[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
		for(int i=0; i<=sh.getLastRowNum(); i++)
		{
			for(int j=0; j<=sh.getRow(0).getLastCellNum()-1; j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		for (int i=0; i<=obj.length-1; i++)
		{
			for (int j=0; j<=obj[0].length-1; j++)
			{
				System.out.println(obj[i][j]+" ");
			}
		}
		System.out.println();

	}

}
