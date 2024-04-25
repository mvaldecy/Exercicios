// Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Questao3 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira dois números");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    scanner.close();
    System.out.println(num1 + num2);
   } 
}
