package easy;

import javax.swing.*;

public class ExecuçãoExercicios_easy {
    public static void main (String[] args){

        //exercicio02
        Exercicio02 exercicio02 = new Exercicio02();
        System.out.println(exercicio02.exibirPalavra ("Jesus é amor"));

        //exercicio03
        Exercicio03 exercicio03 = new Exercicio03();
        String primeiraFrase = JOptionPane.showInputDialog("Digite a primeira frase");
        String segundaFrase = JOptionPane.showInputDialog("Digite a segunda frase");
        System.out.println(exercicio03.exibirFrasesDigitada (primeiraFrase, segundaFrase));

    }
}
