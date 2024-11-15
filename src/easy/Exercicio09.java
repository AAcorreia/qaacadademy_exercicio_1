package easy;

import javax.swing.*;

public class Exercicio09 {
    public void calacularTabuada (int numeroInteiro) {

        if (numeroInteiro <=0 || numeroInteiro >10) {
            System.out.println("Número inválido!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroInteiro + " x " + i + " = " + (numeroInteiro * i));
            }
        }
    }
}