package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador {

    private int idAdministrador;
    private String nome;
    private List<Conteudo> catalogo;

    public Administrador(int idAdministrador, String nome){
        this.idAdministrador = idAdministrador;
        this.nome = nome;
        this.catalogo = new ArrayList<>();
    }

    public void cadastrarTitulo(Conteudo conteudo){
        if(conteudo != null){
            catalogo.add(conteudo);
            System.out.println("Título cadastrado: " + conteudo.getTitulo());
        }
    }

    public void editarTitulo(Conteudo conteudo, String novoTitulo, String novaDescricao){
        if(conteudo != null){
            conteudo.alterarDados(novoTitulo, novaDescricao);
            System.out.println("Título atualizado: " + conteudo.getTitulo());
        }
    }

    public void removerTitulo(Conteudo conteudo){
        if(catalogo.remove(conteudo)){
            System.out.println("Título removido: " + conteudo.getTitulo());
        } else{
            System.out.println("Conteúdo não encontrado ");
        }
    }

    public void alterarDisponibilidade(Conteudo conteudo, StatusDisponibilidade status){
        if(conteudo != null){
            conteudo.alterarDisponibilidade(status);
            System.out.println("Disponibilidade " + conteudo.getTitulo() + " alterada para: " + conteudo.statusDisponibilidade);
        }

    }

    public void gerenciarCategorias(Conteudo conteudo, CategoriaEtiqueta categoria){
        if(conteudo != null && categoria != null){
            conteudo.adicionarCategoria(categoria);
            System.out.println("Categorias gerenciadas");
        }
    }

    public List<Conteudo> listarCatalogo(){
        return catalogo;
    }
}
