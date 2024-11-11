package medium;

public class Exercicio01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println("O numero: " + i + " é Par");
            }   else{
                System.out.println("O numero: " + i + " é Impar");
            }
        }
    }
}
