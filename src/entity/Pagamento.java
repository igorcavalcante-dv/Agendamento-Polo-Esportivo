package entity;

public class Pagamento {
    private String id;
    public String metodo;
    public boolean confirmado;

    public Pagamento(String id, String metodo, boolean confirmado) {
        this.id = id;
        this.metodo = metodo;
        this.confirmado = confirmado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
}
