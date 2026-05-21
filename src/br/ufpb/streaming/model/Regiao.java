package br.ufpb.streaming.model;

public class Regiao {
    private int idRegiao;
    private String nome;
    private String pais;

    public Regiao(int idRegiao, String nome, String pais) {
        this.idRegiao = idRegiao;
        this.nome = nome;
        this.pais = pais;
    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
}
