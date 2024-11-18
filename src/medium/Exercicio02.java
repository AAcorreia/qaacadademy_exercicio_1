package medium;

import javax.swing.*;

public class Exercicio02 {

    public double calcularValorInvestido(double valorInvestimento) {
        int tempoInvestido = 10;
        double valorTotal = 0.0;
        double taxaJuros = 0.12;
        valorTotal = valorInvestimento;

        for (int i = 0; i < tempoInvestido; i++) {
            valorTotal = (valorTotal * taxaJuros) + valorTotal;
        }
        return valorTotal;
    }
    public double calcularValorDoJuros(double valorTotal, double valorInvestido){
        return (valorTotal - valorInvestido);
    }
}
