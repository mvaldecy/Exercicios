/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa
pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int dias, meses, anos, idade_dias;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        System.out.println("anos:");
        anos = scanner.nextInt();
        System.out.println("meses:");
        meses = scanner.nextInt();
        System.out.println("dias:");
        dias = scanner.nextInt();
        scanner.close();
        idade_dias = anos*365 + meses*30 + dias;
        System.out.printf("Idade em dias: %d dias\n", idade_dias);
    }
}
