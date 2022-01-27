package Testng_Advance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelLib {
	String excelPath = "./testResources/demo4.xlsx";
	/**
	 * this method is used to read the deta from excel file
	 * @param sheetname provide the sheetname where you test the deta
	 * @return it return the deta into respective sheet 
	 */
	
	
	public String[][] ReadMultipleData(String sheetname) {
		// TODO Auto-generated method stub
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
                e.printStackTrace();
			} 
		int phyrowcount = workbook.getSheet(sheetname).getPhysicalNumberOfRows();
		int phycellcount = workbook.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
		String [][] scrr =new String[phycellcount][phyrowcount];
		for (int i = 0;i<phyrowcount;i++) {
			for (int j= 0;j<phycellcount;j++) {
				scrr[i][j]= workbook.getSheet(sheetname).getRow(i).getCell(j).toString();
			}
		}
		return scrr;
		
		
	}
	
		
	
}
		
		
		
		
		
		
	


