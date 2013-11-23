/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MODEL;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author Gustavo
 */
public class Dentista {
    
    // --- ATRIBUTOS
    //informações pessoais
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String dataNascimento;
    private String cro;
    //contato   
    private String email;
    private String telefone;
    private String celular;
    private String skype;
    private String facebook;
    //endereço
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String municipio;
    
    
    //-- CAMPOS
    private JTextField campo_nome;
    private JFormattedTextField campo_cpf;
    private JFormattedTextField campo_rg;
    private JComboBox campo_sexo;
    private JFormattedTextField campo_dataNascimento;
    private JTextField campo_cro;
    private JTextField campo_email;
    private JFormattedTextField campo_telefone;
    private JFormattedTextField campo_celular;
    private JTextField campo_skype;
    private JTextField campo_facebook;
    private JTextField campo_rua;
    private JFormattedTextField campo_numero;
    private JTextField campo_complemento;
    private JTextField campo_bairro;
    private JTextField campo_municipio;
    
    
    public Dentista() {
        
    }

    public Dentista(JTextField campo_nome, JFormattedTextField campo_cpf, JFormattedTextField campo_rg, JComboBox campo_sexo, JFormattedTextField campo_dataNascimento, JTextField campo_cro, JTextField campo_email, JFormattedTextField campo_telefone, JFormattedTextField campo_celular, JTextField campo_skype, JTextField campo_facebook, JTextField campo_rua, JFormattedTextField campo_numero, JTextField campo_complemento, JTextField campo_bairro, JTextField campo_municipio) {
        this.campo_nome = campo_nome;
        this.campo_cpf = campo_cpf;
        this.campo_rg = campo_rg;
        this.campo_sexo = campo_sexo;
        this.campo_dataNascimento = campo_dataNascimento;
        this.campo_cro = campo_cro;
        this.campo_email = campo_email;
        this.campo_telefone = campo_telefone;
        this.campo_celular = campo_celular;
        this.campo_skype = campo_skype;
        this.campo_facebook = campo_facebook;
        this.campo_rua = campo_rua;
        this.campo_numero = campo_numero;
        this.campo_complemento = campo_complemento;
        this.campo_bairro = campo_bairro;
        this.campo_municipio = campo_municipio;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public JTextField getCampo_nome() {
        return campo_nome;
    }

    public void setCampo_nome(JTextField campo_nome) {
        this.campo_nome = campo_nome;
    }

    public JFormattedTextField getCampo_cpf() {
        return campo_cpf;
    }

    public void setCampo_cpf(JFormattedTextField campo_cpf) {
        this.campo_cpf = campo_cpf;
    }

    public JFormattedTextField getCampo_rg() {
        return campo_rg;
    }

    public void setCampo_rg(JFormattedTextField campo_rg) {
        this.campo_rg = campo_rg;
    }

    public JComboBox getCampo_sexo() {
        return campo_sexo;
    }

    public void setCampo_sexo(JComboBox campo_sexo) {
        this.campo_sexo = campo_sexo;
    }

    public JFormattedTextField getCampo_dataNascimento() {
        return campo_dataNascimento;
    }

    public void setCampo_dataNascimento(JFormattedTextField campo_dataNascimento) {
        this.campo_dataNascimento = campo_dataNascimento;
    }

    public JTextField getCampo_cro() {
        return campo_cro;
    }

    public void setCampo_cro(JTextField campo_cro) {
        this.campo_cro = campo_cro;
    }

    public JTextField getCampo_email() {
        return campo_email;
    }

    public void setCampo_email(JTextField campo_email) {
        this.campo_email = campo_email;
    }

    public JFormattedTextField getCampo_telefone() {
        return campo_telefone;
    }

    public void setCampo_telefone(JFormattedTextField campo_telefone) {
        this.campo_telefone = campo_telefone;
    }

    public JFormattedTextField getCampo_celular() {
        return campo_celular;
    }

    public void setCampo_celular(JFormattedTextField campo_celular) {
        this.campo_celular = campo_celular;
    }

    public JTextField getCampo_skype() {
        return campo_skype;
    }

    public void setCampo_skype(JTextField campo_skype) {
        this.campo_skype = campo_skype;
    }

    public JTextField getCampo_facebook() {
        return campo_facebook;
    }

    public void setCampo_facebook(JTextField campo_facebook) {
        this.campo_facebook = campo_facebook;
    }

    public JTextField getCampo_rua() {
        return campo_rua;
    }

    public void setCampo_rua(JTextField campo_rua) {
        this.campo_rua = campo_rua;
    }

    public JFormattedTextField getCampo_numero() {
        return campo_numero;
    }

    public void setCampo_numero(JFormattedTextField campo_numero) {
        this.campo_numero = campo_numero;
    }

    public JTextField getCampo_complemento() {
        return campo_complemento;
    }

    public void setCampo_complemento(JTextField campo_complemento) {
        this.campo_complemento = campo_complemento;
    }

    public JTextField getCampo_bairro() {
        return campo_bairro;
    }

    public void setCampo_bairro(JTextField campo_bairro) {
        this.campo_bairro = campo_bairro;
    }

    public JTextField getCampo_municipio() {
        return campo_municipio;
    }

    public void setCampo_municipio(JTextField campo_municipio) {
        this.campo_municipio = campo_municipio;
    }
    
    
    
    
    
}
