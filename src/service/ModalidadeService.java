package service;

import entity.Modalidade;

import java.util.ArrayList;
import java.util.List;

public class ModalidadeService {
    private List<Modalidade> modalidades = new ArrayList<>();

    public String cadastrarModalidade(Modalidade nova){
        if(nova.getValorHora() <= 0){
            return "Erro: O valor da hora deve ser maior que zero.";
        }

        modalidades.add(nova);
        return "Modalidade" + nova.getNome() + "cadastrada com sucesso!";
    }

    public List<Modalidade> listtarTodas(){
        return modalidades;
    }

    public Modalidade buscarPorNome(String nome){
        return modalidades.stream()
                .filter(m -> m.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

}
