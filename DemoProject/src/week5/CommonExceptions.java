package week5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CommonExceptions {
  // Run this 1st
   /* // Runtime exception, when coding it don't
    // force developer to handle exception
    public void hadlingNullPointerException(){
       
        String name = null;
        if(name.equals("Hi")){
            System.out.println("my name is  "+ name);
        }else{
            System.out.println("Sorry name doesn't match !! ");
        }
        //Exception in thread "main" java.lang.NullPointerException -- Console
    }*/
    
   
   /* // Run this 2nd
    // handling Runtime exception, when coding it don't
    // force developer to handle exception
    public void hadlingNullPointerException(){
       
        String name = null;
        
        try {
            if (name.equals("Hi")) {
                System.out.println("my name is  " + name);
            } else {
                System.out.println("Sorry name doesn't match !! ");
            }
        } catch (NullPointerException e) {
            System.out.println("Cool ! No problem, we handled the exception and supress here");
        }
        finally {
            System.out.println("I am like Indian Bribe , Alway run and No Boday stops me" +
                    "Unless the world destroy i.e system.exit(0)");
        }
         
    }*/
      
     
    // Run this 3rd
    // handling Runtime exception, when coding it don't
    // force developer to handle exception
    public void hadlingNullPointerException() throws NullPointerException{
        String name = null;
            if (name.equals("Hi")) {
                System.out.println("my name is  " + name);
            } else {
                System.out.println("Sorry name doesn't match !! ");
            }
    }
    
    // Run this 1st
   /* public void readFileFromLocation()   {

        String line = null;
        String fileName = "TestLeaf.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(
                    "C:\\Users\\v779617\\Desktop\\" + fileName ));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            System.out.println("I am like Indian Bribe , Alway run and No Boday stops me" +
                    "Unless the world destroy i.e system.exit(0)");
        }
    }*/
    
   /* // Run this 2nd - It explain you if your code has possibility to throw 2 exception
    // but your catching with 1 higher exception
    public void readFileFromLocation() {

        String line = null;
        String fileName = "TestLeaf.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(
                    "C:\\Users\\v779617\\Desktop\\" + fileName));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("I am like Indian Bribe , Alway run and No Boday stops me" +
            		"Unless the world destroy i.e system.exit(0)");
        }

    }*/
    
    // Run this 3rd - Multiple catch block,
    // Explain if CM interfere on your issue, does MLA Still required ?
    // here IOException is CM and FileNotFoundException is MLA
    // So, it advisable to have level of escalation.
    public void readFileFromLocation() {

        String line = null;
        String fileName = "TestLeaf.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(
                    "C:\\Users\\v779617\\Desktop\\" + fileName));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } 
        finally {
            System.out.println("I am like Indian Bribe , Alway run and No Boday stops me" +
                    "Unless the world destroy i.e system.exit(0)");
        }

    }
    
    
    }

