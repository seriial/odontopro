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
    
    public void valores_campos_click(String id, Dentista dentista){
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
    
   public void salvar(String id,String tipo_acao, Dentista dentista){
        if(tipo_acao.equals("incluir")){
            incluir(dentista);
        }else if(tipo_acao.equals("alterar")){
            alterar(id,dentista);
        }else{
            System.out.println("Ação inválida!");
        }
    }
   
    public void incluir(Dentista dentista){
        dao.inserir(dentista);
        desabilitaCampos(dentista);
    }
    
    public void excluir(String id, Dentista dentista){
        dao.excluir(id,dentista);
        desabilitaCampos(dentista);
        limpaCampos(dentista);
    }
    
    public void alterar(String id,Dentista dentista){
        dao.alterar(id, dentista);
        desabilitaCampos(dentista);
    }
    
    public void habilitaCampos(Dentista dentista){
        dentista.getCampo_nome().setEnabled(true);
        dentista.getCampo_cpf().setEnabled(true);
        dentista.getCampo_rg().setEnabled(true);
        dentista.getCampo_sexo().setEnabled(true);
        dentista.getCampo_dataNascimento().setEnabled(true);
        dentista.getCampo_cro().setEnabled(true);
        dentista.getCampo_telefone().setEnabled(true);
        dentista.getCampo_celular().setEnabled(true);
        dentista.getCampo_skype().setEnabled(true);
        dentista.getCampo_email().setEnabled(true);
        dentista.getCampo_facebook().setEnabled(true);
        dentista.getCampo_rua().setEnabled(true);
        dentista.getCampo_numero().setEnabled(true);
        dentista.getCampo_complemento().setEnabled(true);
        dentista.getCampo_bairro().setEnabled(true);
        dentista.getCampo_municipio().setEnabled(true);
    }
    
    public void desabilitaCampos(Dentista dentista){
        dentista.getCampo_nome().setEnabled(false);
        dentista.getCampo_cpf().setEnabled(false);
        dentista.getCampo_rg().setEnabled(false);
        dentista.getCampo_sexo().setEnabled(false);
        dentista.getCampo_dataNascimento().setEnabled(false);
        dentista.getCampo_cro().setEnabled(false);
        dentista.getCampo_telefone().setEnabled(false);
        dentista.getCampo_celular().setEnabled(false);
        dentista.getCampo_skype().setEnabled(false);
        dentista.getCampo_email().setEnabled(false);
        dentista.getCampo_facebook().setEnabled(false);
        dentista.getCampo_rua().setEnabled(false);
        dentista.getCampo_numero().setEnabled(false);
        dentista.getCampo_complemento().setEnabled(false);
        dentista.getCampo_bairro().setEnabled(false);
        dentista.getCampo_municipio().setEnabled(false);
    }
    
    public void limpaCampos(Dentista dentista){
        dentista.getCampo_nome().setText("");
        dentista.getCampo_cpf().setText("");
        dentista.getCampo_rg().setText("");
        dentista.getCampo_sexo().setSelectedItem(0);
        dentista.getCampo_dataNascimento().setText("");
        dentista.getCampo_cro().setText("");
        dentista.getCampo_telefone().setText("");
        dentista.getCampo_celular().setText("");
        dentista.getCampo_skype().setText("");
        dentista.getCampo_email().setText("");
        dentista.getCampo_facebook().setText("");
        dentista.getCampo_rua().setText("");
        dentista.getCampo_numero().setText("");
        dentista.getCampo_complemento().setText("");
        dentista.getCampo_bairro().setText("");
        dentista.getCampo_municipio().setText("");
    }

}
