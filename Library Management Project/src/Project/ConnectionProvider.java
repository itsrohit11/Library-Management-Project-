/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author jainr
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
          Class.forName("com.Postgresql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:Postgresql://localhost:3306/librarymanagement","root","rohit6113");
          return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
