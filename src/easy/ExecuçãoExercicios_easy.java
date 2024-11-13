package easy;

import javax.swing.*;

public class ExecuçãoExercicios_easy {
    public static void main (String[] args){

//        //exercicio02
//        Exercicio02 exercicio02 = new Exercicio02();
//        System.out.println(exercicio02.exibirPalavra ("Jesus é amor"));
//
//        //exercicio03
//        Exercicio03 exercicio03 = new Exercicio03();
//        String primeiraFrase = JOptionPane.showInputDialog("Digite a primeira frase");
//        String segundaFrase = JOptionPane.showInputDialog("Digite a segunda frase");
//        System.out.println(exercicio03.exibirFrasesDigitada (primeiraFrase, segundaFrase));


//        //exercicio04
//        Exercicio04 exercicio04 = new Exercicio04();
//        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//        System.out.println("O valor do dobro digitado é: " +exercicio04.calcularDobro(numeroDigitado));

        //exercicio05
        Exercicio05 exercicio05 = new Exercicio05();
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int terceiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        System.out.println("A soma dos tres números é: " + exercicio05.calcularSoma(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A subtração é: " + exercicio05.calcularSubtracao(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A multiplicacao é: " + exercicio05.calcularMultiplicacao(primeiroNumero, segundoNumero, terceiroNumero));
        System.out.println("A media dos tres números é: " + exercicio05.calcularMedia(primeiroNumero, segundoNumero, terceiroNumero));

    }

}
