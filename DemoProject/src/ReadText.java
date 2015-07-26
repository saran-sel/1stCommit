import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadText {

	public static void main(String[] args) throws IOException {
		String line = null;

		File file = new File("C:\\Users\\Lenovo\\Desktop\\allForGood.txt");
		FileReader fs = new FileReader(file);
		BufferedReader bf = new BufferedReader(fs);

		while ((line = bf.readLine())!= null){
			System.out.println(line);
			
		}
		String f = file.getName();
		System.out.println(f);
	}

}
