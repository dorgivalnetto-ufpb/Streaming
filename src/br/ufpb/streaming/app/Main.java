import br.ufpb.streaming.model.*;

void main() {
    Regiao brasil = new Regiao(1, "Brasil", "Brasil");

    CategoriaEtiqueta acao = new CategoriaEtiqueta();
    CategoriaEtiqueta aventura = new CategoriaEtiqueta();

    Conteudo filme1 = new Filme(
            1,
            "Interestelar",
            "Exploração espacial",
            12,
            169,
            "Christopher Nolan",
            2014,
            "Warner Bros",
            "Inglês"
    );

    filme1.adicionarCategoria(acao);
    filme1.adicionarCategoria(aventura);

    Serie serie1 = new Serie(
            2,
            "Dark",
            "Mistérios sobrenaturais",
            16,
            "Jantje Friese",
            2017,
            StatusSerie.FINALIZADA
    );

    Temporada temporada1 = new Temporada(
      1,
      "Temporada 1",
      2017
    );

    Episodio episodio1 = new Episodio(
            1,
            "Segredos",
            59,
            "Desaparecimento de dois meninos na floresta",
            LocalDate.of(2017,12,1)
    );

    Episodio episodio2 = new Episodio(
            2,
            "Mentiras",
            58,
            "Onde está Mikkel?",
            LocalDate.of(2017,12,12)
    );

    serie1.adicionarTemporada(temporada1);

    temporada1.adicionarEpisodio(episodio1);
    temporada1.adicionarEpisodio(episodio2);

    Administrador admin = new Administrador(1, "Administrador");
    admin.cadastrarTitulo(filme1);
    admin.editarTitulo(serie1);
    //admin.removerTitulo(filme1);

    Perfil perfil1 = new Perfil(
      1,
      "Dorgival",
      TipoPerfil.ADULTO
    );

    perfil1.assistir((Reproduzivel) filme1);

    perfil1.assistir(episodio1);

    perfil1.adicionarNaMinhaLista(filme1);
    perfil1.adicionarNaMinhaLista(serie1);

    for(Conteudo conteudo: perfil1.getMinhaLista().listarConteudos()){
        System.out.println(conteudo.getTitulo());
    }

    Avaliacao avaliacao1 = perfil1.avaliar(
      filme1,
      5,
      "Excelente filme"
    );

    Perfil perfil2 = new Perfil(
            2,
            "Ravi",
            TipoPerfil.KIDS
    );

    ControleParental controle = new ControleParental();
    controle.verificarClassificacao(perfil2, serie1);

    filme1.verificarDisponibilidade(brasil);

    serie1.buscarTemporada(1);

    Recomendacao recomendacao = new Recomendacao();
    List<Conteudo> sugestoes = recomendacao.gerarSugestoes(perfil2);
    for(Conteudo conteudo: sugestoes){
        System.out.println("Sugestão: " + conteudo.getTitulo());
    }

    Dispositivo celular = new Dispositivo(
            1,
            "Smartphone",
            "iPhone"
    );

    HistoricoVisualizacao historico = new HistoricoVisualizacao(
            1,
            perfil1,
            filme1,
            celular
    );

    historico.registrarVisualizacao();

    historico.atualizarProgresso(45.5, 50);

    System.out.println(historico);

    DisponibilidadeRegional disponibilidade = new DisponibilidadeRegional(
            1,
            filme1,
            brasil,
            true,
            "");

    System.out.println("Disponível? " + disponibilidade.verificarDisponibilidade());

    disponibilidade.tornarIndisponivel(LocalDate.now(), LocalDate.now().plusDays(30), "Licneça expirada");

    System.out.println(disponibilidade);
    disponibilidade.tornarDisponivel();
    System.out.println(disponibilidade);

}
