package medium;

import javax.swing.*;
import java.util.Random;

public class Exercicio09 {

    public static void main(String[] args) {

        String [] nomeAluno = new String[3];
        int [] numeroAlunos = new int[3];
        Random random = new Random();
        for (int i = 0; i < nomeAluno.length; i++) {
            nomeAluno[i] = JOptionPane.showInputDialog("Digite um nome para o " + (i+1) +"º aluno: ");
            numeroAlunos[i] = random.nextInt(100);
        }

        for (int i =0; i < nomeAluno.length; i++){
            System.out.println("Nome do Aluno: " +nomeAluno[i] +" - Números: " + numeroAlunos[i]);
        }
    }
}
