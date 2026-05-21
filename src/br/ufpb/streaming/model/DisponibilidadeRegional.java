package br.ufpb.streaming.model;

import java.time.LocalDate;

public class DisponibilidadeRegional {

    private int idDisponibilidade;
    private boolean disponivel;
    private LocalDate dataInicioIndisponibilidade;
    private LocalDate dataFimIndisponibilidade;
    private String motivo;

    //Associção
    private Conteudo conteudo;
    private Regiao regiao;

    public DisponibilidadeRegional(int idDisponibilidade, Conteudo conteudo, Regiao regiao, boolean disponivel, String motivo) {
        this.regiao = regiao;
        this.conteudo = conteudo;
        this.motivo = motivo;
        this.disponivel = disponivel;
        this.idDisponibilidade = idDisponibilidade;
    }

    public boolean verificarDisponibilidade(){
        return disponivel;
    }

    public void tornarIndisponivel(LocalDate dataInicio, LocalDate dataFim, String motivo){
        this.disponivel = false;
        this.dataInicioIndisponibilidade = dataInicio;
        this.dataFimIndisponibilidade = dataFim;
        this.motivo = motivo;
        System.out.println(conteudo.getTitulo() + " ficou indispoível em " + regiao.getNome());
    }

    public void tornarDisponivel(){
        this.disponivel = true;
        this.dataInicioIndisponibilidade = null;
        this.dataFimIndisponibilidade = null;
        this.motivo = null;
        System.out.println(conteudo.getTitulo() + "voltou a ficar dispoível em " + regiao.getNome());
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public Conteudo getConteudo(){
        return conteudo;
    }

    public Regiao getRegiao(){
        return regiao;
    }

    @Override
    public String toString() {
        return "Disponibilidade Regional \n" +
                "idDisponibilidade=" + idDisponibilidade + '\n' +
                ", disponivel=" + disponivel + '\n' +
                ", motivo='" + motivo + '\n' +
                ", conteudo=" + conteudo.getTitulo() + '\n' +
                ", regiao=" + regiao.getNome();
    }
}
