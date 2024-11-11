package easy;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
        double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
        double media = (primeiraNota + segundaNota) / 2;

        if (media > 5) {
            System.out.println("Você está Aprovado");
        }
        else if (media == 5) {
            System.out.println("Exame");
        }
        else {
            System.out.println("Você está Reprovado");
        }
    }
}
