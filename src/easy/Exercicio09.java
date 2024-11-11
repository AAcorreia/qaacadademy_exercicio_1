package easy;

import javax.swing.*;

public class Exercicio09 {
    public static void main(String[] args) {
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 á 10 para calcular a tabuada "));
        if (numeroInteiro <=0 || numeroInteiro >10) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroInteiro + " x " + i + " = " + (numeroInteiro * i));
            }
        }
    }
}