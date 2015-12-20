/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author SONY
 */
public class KoneksiDB {
    private static Connection koneksi;
    public static Connection getkoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/pulosari";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,password);
            }catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
     return koneksi;
    }

    
}
