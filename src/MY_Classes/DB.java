/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MY_Classes;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





/**
 *
 * @author Hassan
 */
public class DB {
		private static String servername = "localhost";
		private static String username = "root";
		private static String dbname ="java_library_system";
		private static Integer portNumber = 3306;
		private static String password =  "";
		
		
		// vtrsyr s function to creae and return the conncection
		public static Connection getConnection(){
		
			Connection connection = null;
			
			//burasi en zor kisim bence cunko ilk basta nasil sql bagilacam bilmeyordum
			
			MysqlDataSource datasource = new MysqlDataSource();
			
			datasource.setServerName(servername);
			datasource.setUser(username);
			datasource.setDatabaseName(dbname);
			datasource.setPortNumber(portNumber);
			datasource.setPassword(password);
			
			 try {
            connection = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
		}
		
}
