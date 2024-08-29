package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal = 0;

    public int getTempototal() {
        return tempototal;
    }

//    public void tempoTotalFilmes(Filme f){
//        tempototal += f.getDuracaoEmMinutos();
//    }
//    public void tempoTotalFilmes(Serie s){
//        tempototal += s.getDuracaoEmMinutos();
//    }
//

    public void inclui(Titulo titulo){
        this.tempototal += titulo.getDuracaoEmMinutos();
    }
}


