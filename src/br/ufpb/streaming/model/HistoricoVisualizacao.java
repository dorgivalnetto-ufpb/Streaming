package br.ufpb.streaming.model;

import java.time.LocalDateTime;

public class HistoricoVisualizacao {
    private int idHistorico;
    private LocalDateTime dataHora;
    private double progresso;
    private int tempoAssistido;

    //Associação
    private Perfil perfil;
    private Conteudo conteudo;
    private Dispositivo dispositivo;

    public HistoricoVisualizacao(int idHistorico, Perfil perfil, Conteudo conteudo, Dispositivo dispositivo){
        this.idHistorico = idHistorico;
        this.perfil = perfil;
        this.conteudo = conteudo;
        this.dispositivo = dispositivo;
        this.dataHora = LocalDateTime.now();
        this.progresso = 0.0;
        this.tempoAssistido = 0;
    }

    public void registrarVisualizacao(){
        System.out.println(perfil.getNome() + " iniciou " + conteudo.getTitulo());
        System.out.println("Dispositivo: " + dispositivo.getNome());
        System.out.println("Data/Hora: " + dataHora + "\n");
    }

    public void atualizarProgresso(double progresso, int tempoAssistido){
        if(progresso >=0 && progresso <= 100){
            this.progresso = progresso;
            this.tempoAssistido = tempoAssistido;
            System.out.println("Progresso atualizado para: " + progresso + "%");
        } else{
            System.out.println("Progresso inválido!");
        }
    }

    @Override
    public String toString() {
        return "Historico Visualização \n" +
                "idHistorico=" + idHistorico +
                ", dataHora=" + dataHora +
                ", progresso=" + progresso +
                ", tempoAssistido=" + tempoAssistido +
                ", perfil=" + perfil.getNome() +
                ", conteudo=" + conteudo.getTitulo() +
                ", dispositivo=" + dispositivo;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public int getTempoAssistido() {
        return tempoAssistido;
    }

    public double getProgresso() {
        return progresso;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public int getIdHistorico() {
        return idHistorico;
    }
}
