package week5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestLeafPaymentDetails {

    public String fileName = "TestLeafExercise.txt";

    public void isConcessionApporved(String studentName)
            throws TestLeafException {

        if (studentName.equals("Karim")) {
            System.out.println("Yes, your concession has been approved !! ");
        } else {
            throw new TestLeafException(false, 1000);
        }

    }

    public void checkIsUserAlumniOfTestLeaf(String name)
            throws TestLeafException {

        if (!name.equals("Karim")) {
            throw new TestLeafException(name);
        }

    }

    public void readFileFromLocation() throws IOException, TestLeafException {

        String line = null;
        FileReader fileReader = new FileReader(new File(
                "C:\\Users\\v779617\\Desktop\\" + fileName));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
    }

}
