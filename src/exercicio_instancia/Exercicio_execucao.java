package exercicio_instancia;

public class Exercicio_execucao {

    public static void main(String[] args){

        Execercicio_instancia obj_exercicio_instancia = new Execercicio_instancia();
        System.out.println(obj_exercicio_instancia.nomeMae);
        System.out.println(obj_exercicio_instancia.nomePai);
        obj_exercicio_instancia.nomeIrma();
        System.out.println(obj_exercicio_instancia.calcularDobro(8));
        System.out.println(obj_exercicio_instancia.meuNome());
    }
}
