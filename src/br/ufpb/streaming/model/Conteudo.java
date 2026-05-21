package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {
    private int idConteudo;
    private String titulo;
    private String descricao;
    private int classificacaoIndicativa;
    protected StatusDisponibilidade statusDisponibilidade;

    protected List<CategoriaEtiqueta> categorias = new ArrayList<>();
    protected List<Pessoa> elenco = new ArrayList<>();

    public Conteudo(int idConteudo, String titulo, String descricao, int classificacaoIndicativa){
        this.idConteudo = idConteudo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.statusDisponibilidade = StatusDisponibilidade.DISPONIVEL;
    }

    public boolean verificarDisponibilidade(Regiao regiao){//implementar
        return statusDisponibilidade == StatusDisponibilidade.DISPONIVEL;
    }

    public void adicionarCategoria(CategoriaEtiqueta categoria){
        categorias.add(categoria);
    }

    public void adicionarPessoaAoElenco(Pessoa pessoa){
        elenco.add(pessoa);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getClassificacaoIndicativa(){
        return classificacaoIndicativa;
    }
}
