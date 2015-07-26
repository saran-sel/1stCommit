package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWritePractice {

    public String fileName = "TestLeafExercise.txt";

    /*
     * Read the file form the eclipse directory or from user specified path
     * location
     */
    public void readFileFromLocation() {
       
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.

            // Read file from the eclipse working directory
            // FileReader fileReader = new FileReader(fileName);
            // Read file from the user specified file path
            FileReader fileReader = new FileReader(new File(
                    "C:\\Users\\Babu\\Desktop\\" + fileName));

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(bufferedReader.readLine());
                System.out.println("*****************");
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
    }

    /*
     * Write some text in existing file or create new file and write
     */

    public void writeFileFromLocation() {

        try {

            String content = "\nThis is the content to append into file";

            File file = new File("C:\\Users\\Babu\\Desktop\\" + fileName);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            System.out.println("The file path is:"+file.getAbsoluteFile());
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        FileReadWritePractice fileIo = new FileReadWritePractice();
       //fileIo.readFileFromLocation();
        fileIo.writeFileFromLocation();
    }

}
