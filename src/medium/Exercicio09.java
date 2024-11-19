package medium;

import javax.swing.*;
import java.util.Random;

public class Exercicio09 {

    public void exibirNomeENumeroAlunos(String[] nomeAluno, int [] numeroAlunos) {
        if (nomeAluno[0] == null || nomeAluno[0].isEmpty()) {
            System.out.println("Não há alunos para serem mostrados");
        } else {
            for (int i = 0; i < nomeAluno.length; i++) {
                System.out.println("Nome do aluno: " + nomeAluno[i] + " - Número: " + numeroAlunos[i]);
            }
        }
    }
    public  int[] atribuirNumeracaoAlunos(String[] nomeAlunos){
        int []numeroAlunos = new int[nomeAlunos.length];
        Random random = new Random();
        for (int i =0; i < nomeAlunos.length; i++){
            numeroAlunos[i] = random.nextInt(100);
        }
        return numeroAlunos;
    }
}
