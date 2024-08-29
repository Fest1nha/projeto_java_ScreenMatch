import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso Chefao");
        filme1.setAnoDeLancamento(1980);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duracao do Filme: " + filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(7);
        filme1.avalia(10);
        System.out.println("Total de Avaliacoes: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.mediaDasAvaliacoes());

        System.out.println("-----------------------------------");

        Serie teenWolf = new Serie();
        teenWolf.setNome("Teen Wolf");
        teenWolf.setAnoDeLancamento(2012);
        teenWolf.exibeFichaTecnica();
        teenWolf.setTemporadas(5);
        teenWolf.setEpisodiosPorTemporada(18);
        teenWolf.setMinutosPorEpisodios(45);
        System.out.println("Tempo Total da Serie: " + teenWolf.getDuracaoEmMinutos() + " Minutos");

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(teenWolf);
        System.out.println(calculadora.getTempototal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(teenWolf);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}