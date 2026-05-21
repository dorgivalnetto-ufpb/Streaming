package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int idConta;
    private String email;
    private String senha;
    //agregação
    private List<Perfil> perfis;
    //associação
    private Regiao regiao;

    public Conta(int idConta, String email, String senha, Regiao regiao){
        this.idConta = idConta;
        this.email = email;
        this.senha = senha;
        this.regiao = regiao;

        perfis = new ArrayList<Perfil>();
    }

    public void criarConta(){
        System.out.println("Conta criada com sucesso!");
    }

    public void manterDados(String novoEmail, String novaSenha){
        if(novoEmail!= null && !novoEmail.isBlank()){
            this.email = novoEmail;
        }

        if(novaSenha!= null && !novaSenha.isBlank()){
            this.senha = novaSenha;
        }
        System.out.println("Dados atualizados!");
    }

    public void adicionarPerfil(Perfil perfil){
        //verificar se o perfil já existe

        if (perfil != null){
            perfis.add(perfil);

            System.out.println("Perfil adicionado " + perfil.getNome());
        }

    }

    public void removerPerfil(Perfil perfil){
        if(perfis.remove(perfil)){
            System.out.println("Perfil removido" + perfil.getNome());
        }else{
            System.out.println("Perfil não encontrado!");
        }
    }

    public List<Perfil> listarPerfis(){
        return perfis;
    }

    public String getEmail(){
        return email;
    }

    public Regiao getRegiao(){
        return regiao;
    }

    public int getIdConta(){
        return idConta;
    }

}
