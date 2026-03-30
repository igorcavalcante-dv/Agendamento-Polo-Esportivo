public class Modalidade {
    private String nome;
    private double valorHora;
    private double valorEquipamento;

    public Modalidade(String nome, double valorHora, double valorEquipamento){
        this.nome = nome;
        this.valorHora = valorHora;
        this.valorEquipamento = valorEquipamento;
    }

    public String getNome(){
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }
}
