package medium;

import javax.swing.*;

public class Exercicio06_repeticao {

    public int calcularFatorial (int numeroFatorial) {

        for (int i = numeroFatorial; i > 1; i--) {
            numeroFatorial = numeroFatorial * (i - 1);
        }
        if (numeroFatorial == 0) {
            System.out.println("O fatorial do numero digitado é: 1");
        }
        return numeroFatorial;
    }
}
