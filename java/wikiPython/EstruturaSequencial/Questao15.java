/*
 * Faça um Programa que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
 * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
 * faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float remuneracao_hora;
        int horas_trabalhadas_mes;
        System.out.println("Insira a sua remuneração por hora:");
        remuneracao_hora = scanner.nextFloat();
        System.out.println("Insira a quantidade de horas trabalhadas no mês");
        horas_trabalhadas_mes = scanner.nextInt();
        float salario_bruto = remuneracao_hora * horas_trabalhadas_mes;
        scanner.close();
        double imposto_renda = salario_bruto * 0.11;
        double inss = salario_bruto * 0.08;
        double sindicato = salario_bruto * 0.05;
        double salario_liquido = salario_bruto - (inss + imposto_renda + sindicato);
        System.out.printf("+ Salário Bruto : R$ %.2f\n", salario_bruto);
        System.out.printf("- IR (%s) : R$ %.2f\n", "11%", imposto_renda);
        System.out.printf("- INSS (%s) : R$ %.2f\n", "8%", inss);
        System.out.printf("- Sindicato (%s) : R$ %.2f\n", "5%", sindicato);
        System.out.printf("= Salário Líquido: R$ %.2f\n", salario_liquido); 
    }
}
