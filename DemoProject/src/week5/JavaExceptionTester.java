package week5;


public class JavaExceptionTester {

  
    public static void main(String[] args) {
        
      
        CommonExceptions commonExc = new CommonExceptions();
        // Run this 1st to explain about Run time exception
        // This is run time exception so it never intimate the calling method about exception
        commonExc.hadlingNullPointerException();
        
        // Run this 2nd to explain about Compile time exception
        // This is compileTime exception, we should handle when coding other code 
        // don't get compile
        // Note : If you handle the exception in called method and handling here, will it scold you ?? -- NEVER
        try {
            commonExc.readFileFromLocation();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            System.out.println("I am like Indian Bribe , Alway run and No Boday stops me" +
                    "Unless the world destroy i.e system.exit(0)");
        }
    }

}
