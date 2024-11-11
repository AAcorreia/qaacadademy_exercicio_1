package medium;

import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {
        int tempoInvestido = 10;
        double valorTotal = 0.0;
        double taxaJuros = 0.12;
        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Valor do investimento"));
        valorTotal = tempoInvestido;

        for (int i = 0; i < tempoInvestido; i++) {

            valorTotal = (valorTotal * taxaJuros) + valorTotal;
        }
        System.out.println("O valor investido foi de: " +valorInvestimento);
        System.out.println("O valor do juros foi de: " +(valorTotal - valorInvestimento));
        System.out.println("O valor total do juros foi de: " +valorTotal);

    }
}
