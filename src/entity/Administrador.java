package entity;

public class Administrador {
    private String id;
    public String nomeDono;
    public String nomeEstabelecimento;
    public String cnpj;
    public String telefone;
    public String email;

    public Administrador(String id, String nomeDono, String nomeEstabelecimento, String cnpj, String telefone, String email) {
        this.id = id;
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
