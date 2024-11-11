package easy;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        int soma = primeiroNumero + segundoNumero + terceiroNumero;
        int subtracao = segundoNumero - primeiroNumero;
        int multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        int media = multiplicacao / 3;
        System.out.println("A soma dos tres números é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicacao é: " + multiplicacao);
        System.out.println("A media dos tres números é: " + media);
    }
}
