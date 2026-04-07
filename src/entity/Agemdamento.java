package entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agemdamento {
    private String id;
    public Usuario usuario;
    public Quadra quadra;
    public LocalDate data;
    public LocalTime hora;
    public int quantidadePessoas;
    public boolean equipamento;
    public Pagamento pagamento;

    public Agemdamento(String id, Usuario usuario, Quadra quadra, LocalDate data, LocalTime hora, int quantidadePessoas, boolean equipamento, Pagamento pagamento) {
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
        double valorAdicional = 0.0;
        if (this.equipamento){
            valorAdicional = this.quadra.getModalidade().getValorEquipamento();
        }
        return valorBase + valorAdicional;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
