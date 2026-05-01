package com.polodesportivo.agendamento.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "modaledades")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private double valorHora;
    private double valorEquipamento;

    public Modalidade() {
    }

    public Modalidade(String nome, double valorHora, double valorEquipamento) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.valorEquipamento = valorEquipamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorEquipamento() {
        return valorEquipamento;
    }

    public void setValorEquipamento(double valorEquipamento) {
        this.valorEquipamento = valorEquipamento;
    }
}
