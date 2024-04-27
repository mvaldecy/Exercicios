/*
Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes
entre eles. Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
 */

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        int numA, numB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois numeros inteiros");
        System.out.println("Numero A:");
        numA = scanner.nextInt();
        System.out.println("Numero B:");
        numB = scanner.nextInt();
        scanner.close();
        System.out.println("Relacionamentos A -> B:");
        if (numA == numB) {
            System.out.println("Igual\n");
        }
        if (numA != numB) {
            System.out.println("Não igual\n");
        }
        if (numA < numB) {
            System.out.println("Menor\n");
        }
        if (numA > numB) {
            System.out.println("Maior\n");
        }
        if (numA <= numB) {
            System.out.println("Menor ou igual\n");
        }
        if (numA >= numB) {
            System.out.println("Maior ou igual\n");
        }
    }
    
}
