import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    private Usuario usuario;
    private Quadra quadra;
    private LocalDate data;
    private LocalTime horario;
    private int quantidadePessoas;
    private boolean equipamento;
    private Pagamento pagamento;

    public Agendamento(Usuario usuario, Quadra quadra, LocalDate data, LocalTime horario,
                       int quantidadePessoas,boolean equipamento, Pagamento pagamento){
            this.usuario = usuario;
            this.quadra = quadra;
            this.data = data;
            this.horario = horario;
            this.quantidadePessoas = quantidadePessoas;
            this.equipamento = equipamento;
            this.pagamento = pagamento;
    }

    public LocalDate getData(){
        return data;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public Quadra getQuadra(){
        return quadra;
    }

    public boolean pagamentoConfirmado(){
        return pagamento.isConfirmado();
    }

    public void exibir(){
        System.out.println("Usuario: "+ usuario.getNome());
        System.out.println("Quadra: "+ quadra.getNome());
        System.out.println("Modalidade: "+ quadra.getModalidade().getNome());
        System.out.println("Data: "+ data);
        System.out.println("Horario: "+ horario);
        System.out.println("Pessoas: "+ quantidadePessoas);
        System.out.println("Equipamento: "+ equipamento);
    }
}
