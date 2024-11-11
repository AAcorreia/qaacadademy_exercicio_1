package easy;

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário bruto"));
        double impostoRenda = 0;
        double aliquotaImposto = 0;
        double deducaoImposto = 0;

        if (salario <= 2112.00){
            impostoRenda = 0;
        }
        if (salario >= 2112.01 && salario <= 2826.65) {
            aliquotaImposto = 0.075;
            deducaoImposto = 158.40;
            impostoRenda =  (salario * aliquotaImposto) - deducaoImposto;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            aliquotaImposto = 0.15;
            deducaoImposto = 370.40;
            impostoRenda =  (salario * aliquotaImposto) - deducaoImposto;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            aliquotaImposto = 0.225;
            deducaoImposto = 651.73;
            impostoRenda =  (salario * aliquotaImposto) - deducaoImposto;
        }
        if (salario > 4664.69){
            aliquotaImposto = 0.275;
            deducaoImposto = 884.96;
            impostoRenda =  (salario * aliquotaImposto) - deducaoImposto;

        }
        System.out.println("O valor do sálario bruto a receber é: " + salario);
        System.out.println("O valor do Imposto de renda devido é: " + impostoRenda);
        System.out.println("O valor do sálario liquido a receber é: " + (salario - impostoRenda));


    }
}
