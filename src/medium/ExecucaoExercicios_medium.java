package medium;

import javax.swing.*;

public class ExecucaoExercicios_medium {
    public static void main(String[] args) {

//        //exercicio01
//        Exercicio01 exercicio01 = new Exercicio01();
//        int numero = 15;
//        System.out.println(exercicio01.ExibirParOuImpar(numero));

        //exercicio02
        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Valor do investimento"));
        Exercicio02 exercicio02 = new Exercicio02();
        double valorTotal = exercicio02.calcularValorInvestido(valorInvestimento);

        System.out.println("O valor investido foi de: " +valorInvestimento);
        System.out.println("O valor total do juros foi de: " +valorTotal);
        System.out.println("O valor do juros foi de: " +exercicio02.calcularValorDoJuros(valorTotal, valorInvestimento));

    }
}
