package collections;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.bcel.generic.Select;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Collections {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Desktop\\SelStandAlone\\ApachePOI.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		
	XSSFSheet write=	workbook.createSheet();
	XSSFRow rowwrite =write.createRow(0);
	XSSFCell cell1=rowwrite.createCell(1);
	cell1.setCellValue("Yamini");
	FileOutputStream file1 = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Desktop\\SelStandAlone\\ApachePOI.xlsx");
	workbook.write(file1);
	file1.close();
	
		
		
	}


	
		
		
	
			
		}
		
	
	
	


