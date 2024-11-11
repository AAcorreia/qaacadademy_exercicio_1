package easy;

import javax.swing.*;

public class Exercicio11 {

    public static void main(String[] args) {

        int numeroInt = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro!"));
        for (int i = 0; i <= 99; i++) {
            numeroInt = numeroInt + 2;
            System.out.println("Iteração: " + i +" - Valor: " +numeroInt);
        }
        System.out.println("Fim das iterações!");
    }
}
