package easy;

import javax.swing.*;

public class Exercicio06 {
    public String exibirNota (double primeiraNota, double segundaNota) {

        double media = (primeiraNota + segundaNota) / 2;

        if (media > 5) {
            return "Você está Aprovado";
        }
        if  (media == 5) {
            return "Você está de Exame";
        }
        else {
            return "Você está Reprovado";
        }
    }
}
