package br.ufpb.streaming.model;

public class Filme extends Conteudo implements Reproduzivel{

    private int duracaoTotal;
    private String diretor;
    private int anoLancamento;
    private String studio;
    private String idiomaOriginal;

    public Filme(int idConteudo, String titulo, String descricao, int classificacaoIndicativa,
                 int duracaoTotal, String diretor, int anoLancamento, String studio, String idiomaOriginal){
        super(idConteudo, titulo, descricao, classificacaoIndicativa);
        this.duracaoTotal = duracaoTotal;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.studio = studio;
        this.idiomaOriginal = idiomaOriginal;
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo o filme" + getTitulo());
    }
}
