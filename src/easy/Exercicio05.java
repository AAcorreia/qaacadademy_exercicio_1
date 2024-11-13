package easy;

import javax.swing.*;

public class Exercicio05 {

    public Integer calcularSoma(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int soma = primeiroNumero + segundoNumero + terceiroNumero;
        return soma;
    }

    public Integer calcularSubtracao (int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int subtracao = segundoNumero - primeiroNumero;
        return subtracao;
    }

    public Integer calcularMultiplicacao (int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        return multiplicacao;
    }

    public Integer calcularMedia (int primeiroNumero, int segundoNumero, int terceiroNumero){
        int media = calcularMultiplicacao(primeiroNumero, segundoNumero, terceiroNumero ) / 3;
        return media;
    }


}
