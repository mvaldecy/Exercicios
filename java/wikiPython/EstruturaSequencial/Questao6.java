// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        double pi = 3.141592;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio do circulo em cm: ");
        float raio = scanner.nextFloat();
        scanner.close();
        System.out.printf("Área do círculo: %.2f cm²\n", pi*Math.pow(raio, 2));
        
    }
}
