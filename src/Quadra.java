public class Quadra {

    private int id;
    private String nome;
    private Modalidade modalidade;

    public Quadra(int id, String nome, Modalidade modalidade){
        this.id = id;
        this.nome = nome;
        this.modalidade = modalidade;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public String getNome(){
        return nome;
    }
}
