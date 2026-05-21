package br.ufpb.streaming.model;

import java.util.ArrayList;
import java.util.List;

public class ControleParental {

    private int idControle;
    private List<Conteudo> titulosBloqueados = new ArrayList<>();

    public boolean verificarClassificacao(Perfil perfil, Conteudo conteudo){
        if(titulosBloqueados.contains(conteudo)){
            return false;
        }

        if(perfil.getTipo() == TipoPerfil.KIDS && conteudo.getClassificacaoIndicativa() > 12){
            return false;
        }
        return true;
    }

    public void bloquearTitulo(Conteudo conteudo){
        titulosBloqueados.add(conteudo);
    }

    public void permitirTitulo(Conteudo conteudo){
        titulosBloqueados.remove(conteudo);
    }
}
