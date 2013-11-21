/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GUSTAVO
 */
public class Banco {
            public Connection getConnection() throws SQLException {

            Connection conn = null;
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(
                                    "jdbc:mysql://localhost/db_odonto","root","root");
            } catch (ClassNotFoundException e) {
                    System.out.println("Não foi possivel realizar a conexão com o banco! \n" + e);
            }

            return conn;

    }
}
    

