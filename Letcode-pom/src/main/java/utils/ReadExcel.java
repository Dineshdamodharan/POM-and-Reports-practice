package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] getexcel(String filename)  {
	//String filename = "./test data/login-data.xlsx";
	XSSFWorkbook wbook = null;
	try {
		wbook = new XSSFWorkbook("./data/"+filename+".xlsx");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFSheet sheet = wbook.getSheetAt(0);
	int lastinum = sheet.getLastRowNum();
	System.out.println("lastroll num=="+lastinum);
	int physicalinumber = sheet.getPhysicalNumberOfRows();
	System.out.println("including header=="+physicalinumber);
	short lastcellnum = sheet.getRow(0).getLastCellNum();
	System.out.println("lastcellnum==="+lastcellnum);
	String[][]data = new String[lastinum][lastcellnum];
	  //  for (int i = 1; i <=2; i++)      for specified numbers
		for (int i = 1; i <= lastinum; i++)/* for changing value */ {
		XSSFRow row = sheet.getRow(i);
		/* for (int j = 0; j < 2; j++) */ 
		for (int j = 0; j < lastcellnum; j++){
			XSSFCell cell = row.getCell(j);
			//String value = cell.getStringCellValue();
			DataFormatter dtf= new DataFormatter();
	
				String value = dtf.formatCellValue(cell);
		//	System.out.println(value);
		data [i-1][j]= value ;
		
		} 
	}
	try {
		wbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
	
}
}
