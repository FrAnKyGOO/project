/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author FrAnK
 */
public class connection {
    public static Connection getConnection(){
        Connection con = null;
    try {
                        Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\FrAnK\\Desktop\\dataa.db");
		
						
			}catch (Exception es) {
				System.out.println("error"+es);
			}
        return con;
    
    }   
    
}
