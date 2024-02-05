package Actitime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Write {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		FileInputStream f=new FileInputStream("D:\\Raghu_repet\\Excel\\Write1.xlsx");
		Workbook wb=new XSSFWorkbook(f);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw=sh.createRow(0);
		Cell c=rw.createCell(0);
		c.setCellType(CellType.NUMERIC);
		c.setCellValue("India");
		FileOutputStream fo=new FileOutputStream("D:\\Raghu_repet\\Excel\\Write1.xlsx");
		wb.write(fo);
		wb.close();

	}

}
