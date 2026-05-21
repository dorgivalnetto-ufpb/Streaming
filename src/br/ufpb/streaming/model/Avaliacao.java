package br.ufpb.streaming.model;

import java.time.LocalDate;

public class Avaliacao {

    private int idAvaliacao;
    private Perfil perfil;
    private Conteudo conteudo;
    private int nota;
    private String comentario;
    private LocalDate dataAvaliacao;

    public Avaliacao(Perfil perfil, Conteudo conteudo, int nota, String comentario){
        if(nota < 1 || nota > 5){
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5");
        }
        this.perfil = perfil;
        this.conteudo = conteudo;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = LocalDate.now();
    }
}
