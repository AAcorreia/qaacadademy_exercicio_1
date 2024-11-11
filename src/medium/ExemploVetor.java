package medium;

import javax.swing.*;

public class ExemploVetor {

    public static void main(String[] args) {
        int [] idades;
        idades = new int[5];

        idades[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        idades[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        idades[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        idades[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        idades[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }




    }
}
