package br.ufpb.streaming.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Recomendacao {

    private int idRecomendacao;
    private LocalDateTime dataGeracao;

    public Recomendacao(){
        this.dataGeracao = LocalDateTime.now();
    }

    public List<Conteudo> gerarSugestoes(Perfil perfil){
        List<Conteudo> sugestoes = new ArrayList<>();

        if(perfil.getTipo() == TipoPerfil.KIDS){
            sugestoes.add(new Filme(
                    100,
                    "Super Mario Galaxy",
                    "Aventura espacial do Mario",
                    10,
                    105,
                    "Michael Jelenic",
                    2026,
                    "Nintendo",
                    "Inglês"
            ));
        } else{
            sugestoes.add(new Serie(
                    200,
                    "Breaking Bad",
                    "Professor de Química",
                    18,
                    "Vince Gilligan",
                    2008,
                    StatusSerie.FINALIZADA
            ));
        }
        return sugestoes;
    }

    public LocalDateTime getDataGeracao(){
        return dataGeracao;
    }

}
