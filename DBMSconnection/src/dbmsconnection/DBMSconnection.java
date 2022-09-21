package dbmsconnection;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBMSconnection {
    
    void createConnection(){
        String user = "root";
        String pass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline",user,pass);
            System.out.println("Database connection Successfull");
        } catch(Exception e){
        System.out.println(e);
        }
    }
    public static void main(String[] args) {
       System.out.println("      hehehehehehe ");
       DBMSconnection pro = new DBMSconnection();
       pro.createConnection();
    }
    
}
