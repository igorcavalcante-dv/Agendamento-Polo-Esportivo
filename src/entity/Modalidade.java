package entity;

public class Modalidade {
    private String id;
    public String nome;
    public double valorHora;
    public double valorEquipamento;

    public Modalidade(String id, String nome, double valorHora, double valorEquipamento) {
        this.id = id;
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
