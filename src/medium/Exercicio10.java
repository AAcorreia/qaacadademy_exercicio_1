package medium;

public class Exercicio10 {

    public static void main(String[] args) {
        int [] vetorFobonacci = new int [10];
        vetorFobonacci[0] = 0;
        vetorFobonacci[1] = 1;
        for (int i = 2; i < 10; i++) {
            vetorFobonacci[i] = vetorFobonacci[i-1] + vetorFobonacci[i-2];
        }
        for (int i = 0; i < vetorFobonacci.length; i++) {
            System.out.println(vetorFobonacci[i]);
        }
    }
}
