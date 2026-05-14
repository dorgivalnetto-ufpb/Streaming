package br.ufpb.streaming.model;

import java.time.LocalDate;

public class Episodio implements Reproduzivel{
    private int numero;
    private String titulo;
    private int duracao;
    private String sinopse;
    private LocalDate dataLancamento;

    public Episodio(int numero, String titulo, int duracao, String sinopse, LocalDate dataLancamento){
        this.numero = numero;
        this.titulo = titulo;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.dataLancamento = dataLancamento;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o episódio" + titulo);
    }
}
