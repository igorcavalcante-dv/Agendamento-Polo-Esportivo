public class Pagamento {

    private String metodo;
    private boolean confirmado;

    public Pagamento(String metodo){
        this.metodo = metodo;
        this.confirmado = false;
    }

    public void confirmar(){
        confirmado = true;
    }

    public boolean isConfirmado(){
        return confirmado;
    }
}
