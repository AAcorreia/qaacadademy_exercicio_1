package medium;

public class Exercicio04 {
    public static void main(String[] args) {
        int multiplicacao = 1;
        for (int i = 1; i <= 1000 ; i++) {
            if (multiplicacao >= 100){
                multiplicacao = 1;
            }
            multiplicacao = i * multiplicacao;
            System.out.println("Valor da iteração: " + i + "Valor do calculo: " + multiplicacao);
        }
        System.out.println("Fim");
    }
}
