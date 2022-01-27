import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteData {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\shubham\\Desktop\\selenium\\demowrite.txt");
		
		fos.write('s');
		fos.write('h');
		fos.write('u');
		fos.write('b');
		fos.write('h');
		fos.write('a');
		fos.write('m');

	}

}
