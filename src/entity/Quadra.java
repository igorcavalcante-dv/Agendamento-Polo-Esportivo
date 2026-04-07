package entity;

public class Quadra {
    private String id;
    public String nome;
    public Modalidade modalidade;

    public Quadra(String id, String nome, Modalidade modalidade) {
        this.id = id;
        this.nome = nome;
        this.modalidade = modalidade;
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

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
