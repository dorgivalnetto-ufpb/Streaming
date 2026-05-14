package br.ufpb.streaming.model;

public abstract class Conteudo {
    private int idConteudo;
    private String titulo;
    private String descricao;
    private int classificacaoIndicativa;
    protected StatusDisponibilidade statusDisponibilidade;

    public Conteudo(int idConteudo, String titulo, String descricao, int classificacaoIndicativa){
        this.idConteudo = idConteudo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.statusDisponibilidade = StatusDisponibilidade.DISPONIVEL;
    }

    public boolean verificarDisponibilidade(Regiao regiao){
        //implementar
        return true;
    }

    public String getTitulo() {
        return titulo;
    }
}
