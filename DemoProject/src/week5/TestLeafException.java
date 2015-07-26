package week5;

import java.io.IOException;

public class TestLeafException extends IOException {


    /**
     * When your code travels form one network to another network 
     * or server is advisable to use serialVersionUID for
     * encryption and decryption of data , its called serializable in java
     */
    private static final long serialVersionUID = 1L;
    
    public TestLeafException(){
        super();
    }

    public TestLeafException(int weeks) {
        
        System.out.println("Sorry you have exceed the "+weeks+ " weeks, Kindly pay your due to continue !! ");
    }

    public TestLeafException(String alumniOf) {

        System.out.println("Your " + alumniOf +" alumni, so you might get concession please contact HR !! ");
    }

    public TestLeafException(boolean isConsession, int amount) {
        
        System.out.println("Sorry the  concession of "  + amount +"rupees has not approved please pay your full amount !! ");

    }
    
   
}
