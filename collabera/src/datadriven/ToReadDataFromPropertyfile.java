package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./testResorces/testData.properties");
		Properties properties = new Properties();
		properties.load(fis);
		System.out.println(properties.getProperty("url"));
		

	}

}
