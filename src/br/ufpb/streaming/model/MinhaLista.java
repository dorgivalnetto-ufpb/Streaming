package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista {

    private int idLista;
    private List<Conteudo> conteudos = new ArrayList<>();

    public void adicionarConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo){
        conteudos.remove(conteudo);
    }

    public List<Conteudo> listarConteudos(){
        return conteudos;
    }

    public List<Conteudo> getMinhaLista(){
        return conteudos;
    }
}
