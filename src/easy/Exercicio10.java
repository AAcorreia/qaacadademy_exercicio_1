package easy;

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {
        double investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento!"));
        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        taxaJuros = taxaJuros * tempoInvestido;
        double valorTotal = (investimento * taxaJuros) + investimento;
        System.out.println("Valor investido: " + investimento);
        System.out.println("Taxa de juros acumulado: " + (taxaJuros*100) + "%");
        System.out.println("Valor total: " + valorTotal);
    }
}
