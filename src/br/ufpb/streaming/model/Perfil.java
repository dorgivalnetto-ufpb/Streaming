package br.ufpb.streaming.model;

public class Perfil {

    private int idPerfil;
    private String nome;
    private TipoPerfil tipo;
    private MinhaLista minhaLista;

    public Perfil(int idPerfil, String nome, TipoPerfil tipo){
        this.idPerfil = idPerfil;
        this.nome = nome;
        this.tipo = tipo;
        this.minhaLista = new MinhaLista();
    }

    public void assistir(Reproduzivel reproduzivel){
        reproduzivel.reproduzir();
    }

    public Avaliacao avaliar(Conteudo conteudo, int nota, String comentario){
        return new Avaliacao(this, conteudo, nota, comentario);
    }

    public void adicionarNaMinhaLista(Conteudo conteudo){
        minhaLista.adicionarConteudo(conteudo);
    }

    public int getIdPerfil() {
        return idPerfil;
    }


    public String getNome() {
        return nome;
    }

    public TipoPerfil getTipo(){
        return tipo;
    }

    public MinhaLista getMinhaLista() {
        return minhaLista;
    }
}
