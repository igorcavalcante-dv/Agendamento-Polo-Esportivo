package com.polodesportivo.agendamento.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "quadra_id")
    private Quadra quadra;

    private LocalDate data;
    private LocalTime hora;
    private int quantidadePessoas;
    private boolean equipamento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;

    public Agendamento() {
    }

    public Agendamento(Usuario usuario, Quadra quadra, LocalDate data, LocalTime hora, int quantidadePessoas, boolean equipamento, Pagamento pagamento) {
        this.usuario = usuario;
        this.quadra = quadra;
        this.data = data;
        this.hora = hora;
        this.quantidadePessoas = quantidadePessoas;
        this.equipamento = equipamento;
        this.pagamento = pagamento;
    }

    public double calcularValorTotal(){
        if(this.quadra == null || this.quadra.getModalidade() == null){
            return 0.0;
        }
        double valorBase = this.quadra.getModalidade().getValorHora();
        double valorAdicional = this.equipamento ? this.quadra.getModalidade().getValorEquipamento() : 0.0;

        return valorBase + valorAdicional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public boolean isEquipamento() {
        return equipamento;
    }

    public void setEquipamento(boolean equipamento) {
        this.equipamento = equipamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
