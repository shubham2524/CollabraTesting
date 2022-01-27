package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ToReadDataFromExcelSheet {

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		
		FileInputStream fis = new  FileInputStream("./testResorces/demo1.xlsx");
		
		
		Workbook workbook = WorkbookFactory.create(fis);
		String data =  workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
		System.out.println(data);
		
		

	}

}
