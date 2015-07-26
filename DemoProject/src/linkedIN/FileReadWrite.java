package linkedIN;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
	public static String fileName ="login.txt";
	public static void main(String[] args) throws IOException{
		String line = null;
		
		// impot file class and give the file path 
		File file = new File("C:\\Users\\Lenovo\\Desktop\\"+fileName);
		// this will read the file from the above path given and store it some temp variable
		FileReader reader = new FileReader(file);
		// buffer reader will take the input from file reader and store it in cache or temp memory so dat we can read line by line
		BufferedReader bufferReader = new BufferedReader(reader);
		
		//while loop is only used to iterate over each line and print.. 
		//  bufferReader.readLine() is the actual method to print line..
		//
		while((line =  bufferReader.readLine()) != null){
			
			System.out.println(" **Read line**"+line);
		}
	}
}
