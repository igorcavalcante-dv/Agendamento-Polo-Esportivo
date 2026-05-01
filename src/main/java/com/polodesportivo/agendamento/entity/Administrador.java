package com.polodesportivo.agendamento.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nomeDono;
    private String nomeEstabelecimento;

    @Column(unique = true)
    private String cnpj;
    private String telefone;

    @Column(unique = true)
    private String email;

    public Administrador() {
    }

    public Administrador(String nomeDono, String nomeEstabelecimento, String cnpj, String telefone, String email) {
        this.nomeDono = nomeDono;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

