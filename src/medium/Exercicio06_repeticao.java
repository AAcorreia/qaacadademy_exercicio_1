package medium;

import javax.swing.*;

public class Exercicio06_repeticao {

    public static void main(String[] args) {
        int numeroFatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para calcular o fatorial"));

        for (int i = numeroFatorial; i > 1; i--){
            numeroFatorial = numeroFatorial * (i -1);
        }
        if (numeroFatorial == 0){
            System.out.println("O fatorial do numero digitado é: 1");
        }else {
            System.out.println("O fatorial do número digitado é: " + numeroFatorial);
        }
    }
}
