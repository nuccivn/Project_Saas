package com.project.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servico;
    private String Nome_servico;
    private String Descricao_servico;
    private Double Preco_servico;

    public Long getId_servico() {
        return id_servico;
    }

    public void setId_servico(Long id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return Nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        Nome_servico = nome_servico;
    }

    public String getDescricao_servico() {
        return Descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        Descricao_servico = descricao_servico;
    }

    public Double getPreco_servico() {
        return Preco_servico;
    }

    public void setPreco_servico(Double preco_servico) {
        Preco_servico = preco_servico;
    }
}