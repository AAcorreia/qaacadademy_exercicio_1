package medium;

import javax.swing.*;

public class Exercicio05_vetor {

    public static void main(String[] args) {
        int i = 0;
        int numero = 0;
        int menor = 0;
        int[] vetorNumero = new int[5];

        while (i <= 4) {
            vetorNumero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            i++;
        }
        menor = vetorNumero[0];
        for (i = 0; i < vetorNumero.length; i++) {
            if (vetorNumero[i] < menor) {
                menor = vetorNumero[i];
            }
        }
        System.out.println("menor numero do vetor: " + menor);

    }
}
