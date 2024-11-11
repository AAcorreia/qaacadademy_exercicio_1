package medium;

public class Exercicio03 {
    public static void main(String[] args) {
        int soma = 0;
        int limite = 150;
        for (int i = 0; i <= 100; i++) {
            soma = i + soma;
            System.out.println("Iteração: " +i + " | Soma: " +soma);

            if (soma >= limite){
                break;

            }
        }
        System.out.println("Limite atingido!");
    }

}
