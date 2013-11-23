/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CONTROLLER;

import DAO.EntradasDAO;
import MODEL.Dentista;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class DentistasController {
    EntradasDAO dao = new EntradasDAO();
    
    public void Conexao() {
        dao.getConnection();
    }

    public void carrega_tabela(JTable tabela) throws SQLException{
            try {
                DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID", "NOME", "TELEFONE"}) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            tabela.setModel(modelo);      
            ResultSet rs = dao.carregar_tbDentistar();               
            while (rs.next()) {
               modelo.addRow(new String[]{(rs.getString("id")), (rs.getString("nome")), (rs.getString("telefone")) });
            }
            tabela.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(30); 

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!!!\nContate o ADMINISTRADOR do Sistema!" + ex, "E R R O - N O  B A N C O", 1);
        }   
    }
    
    public void valores_campos_click(Dentista dentista, JTable table_dentista){
        String id = (String) table_dentista.getValueAt(table_dentista.getSelectedRow(), 0);
        try {
            ResultSet rs = dao.carregar_CamposDentista(id);
            while(rs.next()){
                dentista.getCampo_nome().setText(rs.getString("nome"));
                dentista.getCampo_cpf().setText(rs.getString("cpf"));
                dentista.getCampo_rg().setText(rs.getString("rg"));
                dentista.getCampo_sexo().setSelectedItem(rs.getString("sexo"));
                dentista.getCampo_dataNascimento().setText(rs.getString("data_nascimento"));
                dentista.getCampo_cro().setText(rs.getString("cro"));
                dentista.getCampo_telefone().setText(rs.getString("telefone"));
                dentista.getCampo_celular().setText(rs.getString("celular"));
                dentista.getCampo_skype().setText(rs.getString("skype"));
                dentista.getCampo_email().setText(rs.getString("email"));
                dentista.getCampo_facebook().setText(rs.getString("facebook"));
                dentista.getCampo_rua().setText(rs.getString("rua"));
                dentista.getCampo_numero().setText(rs.getString("numero"));
                dentista.getCampo_complemento().setText(rs.getString("complemento"));
                dentista.getCampo_bairro().setText(rs.getString("bairro"));
                dentista.getCampo_municipio().setText(rs.getString("municipio"));
            }
            
        } catch (Exception e) {
        }
    }
    
    

}
