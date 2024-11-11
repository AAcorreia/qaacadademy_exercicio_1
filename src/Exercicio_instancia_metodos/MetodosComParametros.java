package Exercicio_instancia_metodos;

public class MetodosComParametros {

    public static void metodoUmSemRetorno(String nome) {
        System.out.println(nome);
    }
    public static void metodoDoisSemRetorno(String nome) {
        System.out.println(nome);
    }
    public static void metodoTresSemRetorno(String nome) {
        System.out.println(nome);
    }
    public static void metodoQuatroSemRetorno(String nome) {
        System.out.println(nome);
    }
    public static void metodoCincoSemRetorno(String nome) {
        System.out.println(nome);
    }

    public static String metordoUmComRetorno(String nome) {
        return  "O parametro enviado é: " +nome;
    }
    public static String metordoDoisComRetorno(String nome) {
        return  "O parametro enviado é: " +nome;
    }
    public static String metordoTresComRetorno(String nome) {
        return  "O parametro enviado é: " +nome;
    }
    public static String metordoQuatroComRetorno(String nome) {
        return  "O parametro enviado é: " +nome;
    }
    public static String metordoCincoComRetorno(String nome) {
        return  "O parametro enviado é: " +nome;
    }

    public static void main(String[] args) {
        metodoUmSemRetorno("Aline");
        System.out.println(metordoUmComRetorno("Sandra"));
        metodoDoisSemRetorno("Thais");
        System.out.println(metordoDoisComRetorno("Maria"));
        metodoTresSemRetorno("Marcio");
        System.out.println(metordoTresComRetorno("Joana"));
        metodoQuatroSemRetorno("Souza");
        System.out.println(metordoQuatroComRetorno("Ana Luiza"));
        metodoCincoSemRetorno("Tereza");
        System.out.println(metordoCincoComRetorno("Heloisa"));

    }
}
