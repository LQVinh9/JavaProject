/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ConnectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LeVinh
 */
public class ConnectDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        //OK
        //String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=AP;user=sa;password=123";
        //String dbURL = "jdbc:sqlserver://LEVINHPC\\SQLEXPRESS:1433;databaseName=AP;user=sa;password=123";
        
        String dbURL = "jdbc:sqlserver://localhost;databaseName=AP;user=sa;password=123";
        Connection conn = DriverManager.getConnection(dbURL);
        if (conn != null) {
            System.out.println("Connected");
        }
    }
    
}
