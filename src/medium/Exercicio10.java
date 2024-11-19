package medium;

public class Exercicio10 {

    public int[] calcularFibonati(int elemento) {
        int[] vetorFobonacci = new int[elemento];
        vetorFobonacci[0] = 0;
        vetorFobonacci[1] = 1;
        for (int i = 2; i < 10; i++) {
            vetorFobonacci[i] = vetorFobonacci[i - 1] + vetorFobonacci[i - 2];
        }
        return vetorFobonacci;
    }
        public void exibirVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
