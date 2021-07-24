/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;






/**
 *
 * @author ASUS
 */
public class db {
    
    public  static Connection mycon()
    {
        
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pos","root","");
            return con;
            
        } catch (Exception e) {
            System.out.println(e);
        return  null;
        }
        
        
    }
    
}
