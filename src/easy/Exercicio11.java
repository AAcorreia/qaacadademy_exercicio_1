package easy;

import javax.swing.*;

public class Exercicio11 {

    public void calculoNumeroDigitado(int numeroInt) {

        for (int i = 0; i <= 100; i++) {
            numeroInt = numeroInt + 2;
            System.out.println("Iteração: " + i +" - Valor: " +numeroInt);
        }
        System.out.println("Fim das iterações!");
    }
}
