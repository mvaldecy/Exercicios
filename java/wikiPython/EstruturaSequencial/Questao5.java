// Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Insira a distancia em metros:");
      float metros = scanner.nextFloat();
      scanner.close();
      System.out.printf("%.2f cm.\n", metros * 100);
    }
}