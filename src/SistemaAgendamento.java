import java.time.LocalTime;
import java.time.LocalDate;

public class SistemaAgendamento {
    private AgendamentoRepository repository;

    public SistemaAgendamento(){
        repository = new AgendamentoRepository();
    }

    public boolean verificarDisponibilidade(Quadra quadra, LocalDate data, LocalTime horario){

        for(Agendamento a : repository.listar()){

            if (a.getQuadra().equals(quadra)
                && a.getData().equals(data)
                && a.getHorario().equals(horario) ){

                return false;
            }
        }
        return true;
    }

    public void realizarAgendamento(Agendamento agendamento){

        if (!agendamento.pagamentoConfirmado()){
            System.out.println("Pagamento não confirmado");
            return;
        }
        if (verificarDisponibilidade(
                agendamento.getQuadra(),
                agendamento.getData(),
                agendamento.getHorario())) {
            repository.salvar(agendamento);
            System.out.println("Agendamento realizado com sucesso.");
        } else {
            System.out.println("Horário indisponivel.");
        }
    }

    public void listarAgendamentos(){
        for (Agendamento a: repository.listar()){
            a.exibir();
            System.out.println("---------------");
        }
    }
}
