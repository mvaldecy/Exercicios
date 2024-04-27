/*
 Escreva um programa que leia um número inteiro e exiba o seu módulo.
O módulo de um número x é:
x se x é maior ou igual a zero
x * (-1) se x é menor que zero
 */

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero inteiro:");
        numero = scanner.nextInt();
        scanner.close();
        if (numero >= 0) {
            System.out.printf("%d\n", numero);
        } else {
            System.out.printf("a %d\n", numero*(-1));
        }
    }
}
