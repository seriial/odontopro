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
    
       String cadastraDentista = "INSERT INTO DENTISTA (nome,cpf,rg,sexo,data_nascimento,cro,email,telefone,celular,skype,facebook,rua,numero,complemento,bairro,municipio) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       String alteraDentista = "UPDATE DENTISTA SET NOME=?,CPF=?,RG=?,SEXO=?,DATA_NASCIMENTO=?,CRO=?,EMAIL=?,TELEFONE=?,CELULAR=?,SKYPE=?,FACEBOOK=?,RUA=?,NUMERO=?,COMPLEMENTO=?,BAIRRO=?,MUNICIPIO=? WHERE ID = ?";
       String excluirDentista = "DELETE FROM DENTISTA WHERE id=?";
       
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
        
         public ResultSet carregar_CamposDentista(String id) throws SQLException{
            Connection con = new EntradasDAO().getConnection();
            ResultSet rs = null;
            String sql = "SELECT * FROM dentista where id = '" + id+"'";
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
         
         public void inserir(Dentista dentista){
            Connection con = new EntradasDAO().getConnection();
            PreparedStatement pstm;
            try{
                pstm = con.prepareStatement(cadastraDentista);
                pstm.setString(1, dentista.getNome());
                pstm.setString(2, dentista.getCpf());
                pstm.setString(3, dentista.getRg());
                pstm.setString(4, dentista.getSexo());
                pstm.setString(5, dentista.getDataNascimento());
                pstm.setString(6, dentista.getCro());
                pstm.setString(7, dentista.getEmail());
                pstm.setString(8, dentista.getTelefone());
                pstm.setString(9, dentista.getCelular());
                pstm.setString(10, dentista.getSkype());
                pstm.setString(11, dentista.getFacebook());
                pstm.setString(12, dentista.getRua());
                pstm.setString(13, dentista.getNumero());
                pstm.setString(14, dentista.getComplemento());
                pstm.setString(15, dentista.getBairro());
                pstm.setString(16, dentista.getMunicipio());
                pstm.executeUpdate();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
         
         public void alterar(String id,Dentista dentista){
            Connection con = new EntradasDAO().getConnection();
            PreparedStatement pstm;
            try{
                pstm = con.prepareStatement(alteraDentista);
                pstm.setString(1, dentista.getNome());
                pstm.setString(2, dentista.getCpf());
                pstm.setString(3, dentista.getRg());
                pstm.setString(4, dentista.getSexo());
                pstm.setString(5, dentista.getDataNascimento());
                pstm.setString(6, dentista.getCro());
                pstm.setString(7, dentista.getEmail());
                pstm.setString(8, dentista.getTelefone());
                pstm.setString(9, dentista.getCelular());
                pstm.setString(10, dentista.getSkype());
                pstm.setString(11, dentista.getFacebook());
                pstm.setString(12, dentista.getRua());
                pstm.setString(13, dentista.getNumero());
                pstm.setString(14, dentista.getComplemento());
                pstm.setString(15, dentista.getBairro());
                pstm.setString(16, dentista.getMunicipio());
                pstm.setString(17, id);
                pstm.executeUpdate();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
             
         }
         public void excluir(String id,Dentista dentista){
            Connection con = new EntradasDAO().getConnection();
            PreparedStatement pstm;
            try{
                pstm = con.prepareStatement(excluirDentista);
                pstm.setString(1, id);
                pstm.execute();
                con.close();
                JOptionPane.showMessageDialog(null," Excluido com sucesso!");
            } catch (Exception e) {
                e.printStackTrace();
            }
         }
         
    
}
