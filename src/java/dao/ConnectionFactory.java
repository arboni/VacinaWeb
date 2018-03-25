 package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Loir_Arboni
 */
public class ConnectionFactory {
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3306/vacinaweb";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            Connection conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return conexao;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
