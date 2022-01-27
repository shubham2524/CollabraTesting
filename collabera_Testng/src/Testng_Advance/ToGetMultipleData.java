package Testng_Advance;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToGetMultipleData {
	@DataProvider
	public String[][] credentials(){
		excelLib  lib = new excelLib();
		return lib.ReadMultipleData("Sheet1");
		
		
		
		
		
		
	}
	@Test(dataProvider="credentials")
	public void ReadMultipleDataFromExcel(String [] data) {
		
		System.out.println(data[1]);
		
		
	}
		

}
