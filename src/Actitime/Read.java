package Actitime;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File f=new File("D:\\Raghu_repet\\Excel\\Sample.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.getRow(0);
		Cell c=rw.getCell(0);
		System.out.println(c.getStringCellValue());

	}

}
