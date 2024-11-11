package medium;

import javax.swing.*;

public class Exercicio06_vetor {

    public static void main(String[] args) {

        int numeroFatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para calcular o fatorial"));
        int fatorial = numeroFatorial;
        int[] vetorFatorial = new int[numeroFatorial];
        for (int i = numeroFatorial; i >= 1; i--) {
            vetorFatorial[i - 1] = i;
        }
        for (int i = numeroFatorial - 1; i >= 1; i--) {
            fatorial = fatorial * vetorFatorial[i - 1];
        }
        System.out.println("O valor do fatorial de: " + numeroFatorial + " é igual: " + fatorial);

    }
}