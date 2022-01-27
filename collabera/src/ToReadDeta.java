import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDeta {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//File abspath = new File("C:\\Users\\shubham\\Desktop\\selenium\17.txt");
		FileInputStream fis = new FileInputStream("C:\\Users\\shubham\\Desktop\\selenium\\demo.txt");
		
		int c = fis.read();
		while(c!=-1) {
			System.out.print((char)c);
			c =fis.read();
			Thread.sleep(100);
		}
		
		

	}

}
