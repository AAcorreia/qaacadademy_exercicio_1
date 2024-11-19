package medium;

import javax.swing.*;

public class ExecucaoExercicios_medium {
    public static void main(String[] args) {

//        //exercicio01
//        Exercicio01 exercicio01 = new Exercicio01();
//        int numero = 15;
//        System.out.println(exercicio01.ExibirParOuImpar(numero));

//        //exercicio02
//        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Valor do investimento"));
//        Exercicio02 exercicio02 = new Exercicio02();
//        double valorTotal = exercicio02.calcularValorInvestido(valorInvestimento);
//
//        System.out.println("O valor investido foi de: " +valorInvestimento);
//        System.out.println("O valor total do juros foi de: " +valorTotal);
//        System.out.println("O valor do juros foi de: " +exercicio02.calcularValorDoJuros(valorTotal, valorInvestimento));

//        //exercicio03
//        Exercicio03 exercicio03 = new Exercicio03();
//        exercicio03.somaAteMil();

//        //exercicio04
//        Exercicio04 exercicio04 = new Exercicio04();
//        exercicio04.multiplicacoaAteMil();

        //exercicio05_vetor//
//        int [] vetorNumeros = {5, 3, 8, 9, 4};
//        Exercicio05_vetor exercicio05_vetor = new Exercicio05_vetor();
//        System.out.println("o menor numero é: " +exercicio05_vetor.retornaMenorNumero(vetorNumeros));

//        //exercicio06_repeticao
//        int numeroFatorial = 10;
//        Exercicio06_repeticao exercicio06Repeticao = new Exercicio06_repeticao();
//        System.out.println(exercicio06Repeticao.calcularFatorial(numeroFatorial));

//        //exercicio07_08
//        Exercicio07_08_vetor exercicio0708Vetor = new Exercicio07_08_vetor();
//        exercicio0708Vetor.exibirMesesDoAno();

        //exercicio09
        String [] nomeAlunos = {"Flavio", "Aline", "Mariana"};
        Exercicio09 exercicio09 = new Exercicio09();
        int [] numeroAlunos = exercicio09.atribuirNumeracaoAlunos(nomeAlunos);
        exercicio09.exibirNomeENumeroAlunos(nomeAlunos, numeroAlunos);


        //exercicio10


    }
}
