/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import MODEL.Dentista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class EntradasDAO {
    
        public Connection getConnection() {
            try {
                return DriverManager.getConnection("jdbc:mysql://localhost/db_odonto", "root", "root");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao conectador ao Banco\nErro: " + e, "E R R O", 0);
                throw new RuntimeException(e);
            }
        }
        
        //metodos para entidade Dentista:
        public ResultSet carregar_tbDentistar() throws SQLException{
            Connection con = new EntradasDAO().getConnection();
            ResultSet rs = null;
            String sql = "SELECT * FROM dentista ORDER BY nome";
            try {
                PreparedStatement stmt = con.prepareStatement(sql);
                rs = stmt.executeQuery();
                stmt.execute();
            }catch (SQLException u) {
                throw new RuntimeException(u);
            } finally {
                con.close();
            }
            return rs;
        }
    
}
