package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Conteudo{

    private String criador;
    private int anoEstreia;
    private int anoEncerramento;
    private StatusSerie status;
    private int quantidadeTemporadas;
    private List<Temporada> temporadas = new ArrayList<Temporada>();

    public Serie(int idConteudo, String titulo, String descricao, int classificacaoIndicativa,
        String criador, int anoEstreia, StatusSerie status){
        super(idConteudo, titulo, descricao, classificacaoIndicativa);
        this.criador = criador;
        this.anoEstreia = anoEstreia;
        this.status = status;
    }

    public void adicionarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }

   public List<Temporada> obterTemporadas(){
        return temporadas;
   }

   public Temporada buscarTemporada(int numero){
        for(Temporada temporada: temporadas){
            if(temporada.getNumero() == numero){
                return temporada;
            }
        }
        return null;
   }

}
