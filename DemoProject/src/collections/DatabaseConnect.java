package db;

// import from sql
import java.sql.*;

public class DatabaseConnect {

	// JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/bugs";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) {
	   
	   Connection conn = null;
	   Statement stmt = null;
	   
	   
	   try{
	   
		   //STEP 2: Register JDBC driver
	      Class.forName(JDBC_DRIVER);
	     
	      //STEP 3: Open a connection
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	
	      //STEP 4: Execute a query
	      stmt = conn.createStatement();
	      
	      String sql = "SELECT id,value FROM bugs.priority Order by id";
	      ResultSet rs = stmt.executeQuery(sql);
	
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	    	  
	    	     	  
	         //Retrieve by column name
	         int gfhfh  = rs.getInt("id");
	         String yuy = rs.getString("value");
	
	         //Display values
	         System.out.print("ID: " + gfhfh +", Value: " + yuy +"\n");
	
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	      
	   }catch(SQLException se){
	      
		   //Handle errors for JDBC
	      se.printStackTrace();
	      
	   }catch(Exception e){
	      
		   //Handle errors for Class.forName
	      e.printStackTrace();
	      
	   }finally{
	     
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se){
	    	  se.printStackTrace();
	      }
	      
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   
   
   }
   
  static final String JDBC_Driver ="driver";
  static final String DB_URL1 = "url";
  
  static final String Username ="";
  static final String password = "";
  
  public static void main1(String[] args) {
	  Connection conn =null;
	  Statement stmt =null;
	  
	Class.forName(JDBC_Driver);
	
	conn = DriverManager.getConnection(Username);
	stmt = conn.createStatement();
	
	String query = "sql query";
ResultSet rs=	stmt.executeQuery(query);

while(rs.next()){
	int id = rs.getInt("Col1");
	String col = rs.getString("Col2");
	System.out.print("ID" + id + "Name" + col);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}