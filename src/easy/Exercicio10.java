package easy;

import javax.swing.*;

public class Exercicio10 {
    public double calcularValorInvestimento (double ValorInvestimento) {
        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        double taxaJurosTotal = 0.0;

        for (int i = 1; i <= tempoInvestido; i++) {
            taxaJurosTotal = taxaJurosTotal + taxaJuros;
        }
        double valorTotal = (ValorInvestimento * taxaJurosTotal) + ValorInvestimento;
        return valorTotal;
    }

    public double calcularValorJuros (double valorTotal, double ValorInvestimento){
        return (valorTotal - ValorInvestimento);
    }
}
