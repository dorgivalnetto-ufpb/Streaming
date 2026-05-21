package br.ufpb.streaming.model;

public class Dispositivo {

    private int idDispositivo;
    private String tipo;
    private String nome;

    public Dispositivo(int idDispositivo, String tipo, String nome){
        this.idDispositivo = idDispositivo;
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getIdDispositivo() {
        return idDispositivo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "idDispositivo=" + idDispositivo +
                ", tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
