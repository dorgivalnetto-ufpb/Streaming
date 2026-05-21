package br.ufpb.streaming.model;

public class Administrador {

    private int idAdministrador;
    private String nome;

    public Administrador(int idAdministrador, String nome){
        this.idAdministrador = idAdministrador;
        this.nome = nome;
    }

    public void cadastrarTitulo(Conteudo conteudo){
        System.out.println("Título cadastrado: " + conteudo.getTitulo());
    }

    public void editarTitulo(Conteudo conteudo){
        System.out.println("Título editado: " + conteudo.getTitulo());
    }

    public void removerTitulo(Conteudo conteudo){
        System.out.println("Título removido: " + conteudo.getTitulo());
    }

    public void alterarDisponibilidade(Conteudo conteudo){
        System.out.println("Disponibilidade alterada para: " + conteudo.getTitulo());
    }

    public void gerenciarCategorias(){
        System.out.println("Categorias gerenciadas");
    }
}
