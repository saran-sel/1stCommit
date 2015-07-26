package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaConceptsPractice {

    public String fileName = "TestLeafExercise.txt";

    /*
     * Read the file form the eclipse directory or from user specified path
     * location
     */
    public void readFileFromLocation() {
        // The name of the file to open.
        // String fileName = "TestLeafExercise.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.

            // Read file from the eclipse working directory
            // FileReader fileReader = new FileReader(fileName);
            // Read file from the user specified file path
            FileReader fileReader = new FileReader(new File(
                    "C:\\Users\\v779617\\Desktop\\" + fileName));

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
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

            String content = "This is the content to write into file";

            File file = new File("C:\\Users\\v779617\\Desktop\\" + fileName);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 
     */

    public void regexUsage() {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        // Don't print after the digits (.*)(\\d+)(.*)
        // Print only after the digits (\\d+)(.*)
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }

        // Logic to know at what index the "o" present in the string
        String letter = "o";
        int i = 0, count = 0;
        while ((i = line.indexOf(letter, i++)) != -1) {
            count++;
            i += letter.length();
            System.out.println(" The index of mathcing o in string is " + i);
        }
        System.out.println("The no of 'o' present in String is  : " + count);
    }

    /*
     * String object playing
     */
    public void playWithString() {
        StringBuffer str = new  StringBuffer("Welcome to TestLeaf");
        System.out.print("Return Value :");
        System.out.println(str.substring(10));

        System.out.print("Return Value :");
        System.out.println(str.substring(10, 15));

        // StringBuffer is thread safe - Slowness
        // StringBuffer strBuff = new StringBuffer();
        // String builder is not thread safe - Faster
        StringBuffer strBuff = new StringBuffer(str);
        // append string after the original value
        strBuff.append("  - After the string Original String ends !! ");
        // append string in the 0th size
        strBuff.insert(0, " !! Before the string Original String Starts ");
        System.out.println("The reversed string "+strBuff.reverse());
        
        // Find the nth Character of the string
        char mySearchChar = str.charAt(5);
        // If you don't want the result as a char data type, but rather as a
        // string, you would use the
        String charValue = Character.toString(mySearchChar);
    }

    public void loopMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Jan");
        map.put("2", "Feb");
        map.put("1", "Mar");
        map.put("4", "Apr");
        map.put("5", "May");
        map.put("6", "Jun");
        
        // There are multiple way to iterate 
        
        System.out.println("Example 1...");
        // Map -> Set -> Iterator -> Map.Entry -> troublesome
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("The key is: " + mapEntry.getKey()
                    + ",value is :" + mapEntry.getValue());
        }

        System.out.println("Example 2...");
        // more elegant way
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }

        System.out.println("Example 3...");
        // weired way, but works anyway
        for (Object key : map.keySet()) {
            System.out.println("Key : " + key.toString() + " Value : "
                    + map.get(key));
        }
    }

    public void loopListandSet() {
        // List concept , it maintain order and allow duplicate
        List<String> testLeafTrainer = new ArrayList<String>();
        testLeafTrainer.add("Babu"); // 1st babu
        testLeafTrainer.add("Venu");
        testLeafTrainer.add("Bharathan");
        testLeafTrainer.add("Babu"); // 2nd time babu
        testLeafTrainer.add("yamini");
        System.out.println(" Concept of List");
        for (String tempObj : testLeafTrainer) {
            System.out.println(tempObj);
        }

        // Set concept, it doesn't maintain order doesn't allow duplicate

        Set<String> testLeafTrainerSet = new HashSet<String>();
        testLeafTrainerSet.add("Babu"); // 1st babu
        testLeafTrainerSet.add("Venu");
        testLeafTrainerSet.add("Bharathan");
        testLeafTrainerSet.add("Babu"); // 2nd time babu
        System.out.println(" Concept of Set ");
        for (String tempObj : testLeafTrainerSet) {
            System.out.println(tempObj);
        }

    }

    public static void main(String[] args) {

        JavaConceptsPractice javaPracticeObj = new JavaConceptsPractice();
        // Read file form using file reader
        //javaPracticeObj.readFileFromLocation();
        // Write file in text file
        //javaPracticeObj.writeFileFromLocation();
        // Database connection creation
        // javaPracticeObj.createDBPool();
        //javaPracticeObj.regexUsage();
        // String utils
        javaPracticeObj.playWithString();
        // Loop Map
        //javaPracticeObj.loopMap();
        // List and Set loop
        //javaPracticeObj.loopListandSet();
        
        
        
        
        
        

    }
}
