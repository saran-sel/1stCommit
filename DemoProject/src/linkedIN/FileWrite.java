package linkedIN;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static String fileName ="yamini.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String contentToWrite = "\r\nI will be appended in the existing file yamini";
//		File file = new File("C:\\Users\\Lenovo\\Desktop\\"+fileName);
		int count = 9;
		StringBuffer str = new StringBuffer("C:\\Users\\Lenovo\\Desktop\\");
		str.append(fileName);
		str.append("1");
		str.append(count);
		System.out.println(str.toString());
//		if (!file.exists()){
//			file.createNewFile();
//		}
//		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write(contentToWrite);
//		bw.close();
	}

}
