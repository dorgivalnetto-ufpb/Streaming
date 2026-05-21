package br.ufpb.streaming.model;

public class Ator extends Pessoa{

    public Ator(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
