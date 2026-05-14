package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private int numero;
    private String titulo;
    private int anoLancamento;

    private List<Episodio> episodios = new ArrayList<Episodio>();

    public Temporada(int numero, String titulo, int anoLancamento){
        this.numero = numero;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public void adicionarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public int getNumero(){
        return numero;
    }
}
