package easy;

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int dobro = (numeroDigitado) * 2;
        System.out.println("O dobro do valor digitado é: " + dobro);
    }
}
