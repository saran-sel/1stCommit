package week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTL {
	
	public static void main(String[] args) {
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

}
