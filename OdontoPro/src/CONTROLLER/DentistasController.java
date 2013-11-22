/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CONTROLLER;

import DAO.EntradasDAO;
import MODEL.Dentista;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class DentistasController {
    EntradasDAO dao = new EntradasDAO();
    
    public void carrega_tabela(JTable tabela) throws SQLException{
        System.out.println("metodo acessado!");
            try {
                DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID", "NOME", "TELEFONE"}) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            tabela.setModel(modelo);
            ResultSet rs = dao.carregar_tbDentistar();
                 try {
                 while (rs.next()) {
                    modelo.addRow(new String[]{(rs.getString("id")), (rs.getString("nome")), (rs.getString("telefone")) });
                }
                tabela.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(50); 
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro!!!\nContate o ADMINISTRADOR do Sistema!" + e, "E R R O - N O  B A N C O", 1);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro!!!\nContate o ADMINISTRADOR do Sistema!" + ex, "E R R O - N O  B A N C O", 1);
        }
        
    }
    
    

}
