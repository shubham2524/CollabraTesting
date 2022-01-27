import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcelSheet {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./testResorces/deom2.xlsx");
		
		
		Workbook workbook = WorkbookFactory.create(fis);
		String data = 	workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(data);
		
		
		
		
		
		

	}

}
