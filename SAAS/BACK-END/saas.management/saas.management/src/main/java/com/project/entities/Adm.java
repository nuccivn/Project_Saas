package com.project.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Adm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_adm;
    private String Nome_adm;
    private String Email_Adm;
    private String Senha_Adm;
    private String Cargo;

    public Long getId_adm() {
        return Id_adm;
    }
    public void setId_adm(Long id_adm) {
        Id_adm = id_adm;
    }
    public String getNome_adm() {
        return Nome_adm;
    }
    public void setNome_adm(String nome_adm) {
        Nome_adm = nome_adm;
    }
    public String getEmail_Adm() {
        return Email_Adm;
    }
    public void setEmail_Adm(String email_Adm) {
        Email_Adm = email_Adm;
    }
    public String getSenha_Adm() {
        return Senha_Adm;
    }
    public void setSenha_Adm(String senha_Adm) {
        Senha_Adm = senha_Adm;
    }
    public String getCargo() {
        return Cargo;   
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}