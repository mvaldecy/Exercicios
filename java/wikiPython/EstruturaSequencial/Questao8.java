/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        float remuneracao_hora, remuneracao_mensal;
        int horas_trabalhadas;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua remuneração por hora: ");
        remuneracao_hora = scanner.nextFloat();
        System.out.println("Insira as horas trabalhadas no mês: ");
        horas_trabalhadas = scanner.nextInt();
        scanner.close();
        remuneracao_mensal = remuneracao_hora * horas_trabalhadas;
        System.out.printf("Remuneração mensal: R$ %.2f.\n", remuneracao_mensal);

    }
}
