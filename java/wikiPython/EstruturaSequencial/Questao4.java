// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira as 4 notas");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float nota4 = scanner.nextFloat();
        scanner.close();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.printf("Média: %.2f\n", media);

    }
}
