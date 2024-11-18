package medium;

public class Exercicio04 {
    public void multiplicacoaAteMil() {
        int multiplicacao = 1;
        for (int i = 1; i <= 1000 ; i++) {
            if (multiplicacao >= 1000){
                multiplicacao = 1;
            }
            multiplicacao = i * multiplicacao;
            System.out.println("Valor da iteração: " + i + " - Valor do calculo: " + multiplicacao);
        }
        System.out.println("Fim");
    }
}
