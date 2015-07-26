package linkedIN;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public void txtRead(String path) throws IOException{
		File file = new File(path);
		FileReader filereader = new FileReader(file);
		BufferedReader bufferreader = new BufferedReader(filereader);
	while (line	bufferreader.readLine();
		System.out.println(bufferreader.readLine());
	}

}
