package src.anearcan;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.*;
import javax.swing.*;
import java.sql.*;

public class Utility {
    static Connection con ;
    static String  dbUrl = "jdbc:mysql://localhost:3306/sourceit_vss";
    static Statement stmt;
    static PreparedStatement pStmt;
    public static final int numberOfTransactions = 50;// This is the max number of items someone can purchase or rent at a time
    
    public Utility() throws SQLException{
           con = DriverManager.getConnection (dbUrl, "root","test");    
           stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }
    
    
    public static Date addDays(Date date, int days)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, + days); //minus number would decrement the days
        return cal.getTime();
    }


    public static void returnToMainMenu(Employee employee) throws ClassNotFoundException, SQLException {
            if(employee.IsAdmin() == true){
                new AdminLoginSuccess(employee).setVisible(true);
               
            }else {
                new LoginSuccessful(employee).setVisible(true);
     
            }
    }
    
    public static void connect() throws ClassNotFoundException, SQLException{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection (dbUrl, "root","test");
                
        }

}
