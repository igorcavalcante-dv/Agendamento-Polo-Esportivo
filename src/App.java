import java.time.LocalTime;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        SistemaAgendamento sistema =   new SistemaAgendamento();

        Usuario usuario = new Usuario("Igor", "0000000000",
                "859999999","igor@email.com");

        Modalidade futsal = new Modalidade("Futsal", 120,30);

        Quadra quadra1 = new Quadra(1, "Quadra Central",futsal);

        Pagamento pagamento = new Pagamento("PIX");
        pagamento.confirmar();

        Agendamento ag = new Agendamento(usuario,quadra1,LocalDate.of(2026,6,10),
                LocalTime.of(18,0),10,true,pagamento );

        sistema.realizarAgendamento(ag);
        sistema.listarAgendamentos();
    }
}
