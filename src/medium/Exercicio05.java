package medium;

import javax.swing.*;

public class Exercicio05 {

    public static void main(String[] args) {
        int i = 1;
        int numero = 0;
        int menor = 0;

        while (i<=5){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            System.out.println(numero);
            if (numero < menor || i == 1){
                menor = numero;
            }
            i++;
        }
        System.out.println("o menor numero digitado é: "+ menor);
    }
}
