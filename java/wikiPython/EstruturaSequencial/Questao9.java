/*
 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.println("Insira a temperatura em Fahrenheit");
        fahrenheit = scanner.nextFloat();
        celsius = 5 * ((fahrenheit - 32) / 9);
        scanner.close();
        System.out.printf("A temperatura esta em %.2f°C\n", celsius);

    }
}
