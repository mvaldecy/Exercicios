/*
 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:  
V =  3.14159 * R * R * A 
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        double PI = 3.14159;
        float raio, altura;
        double volume;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio da lata em  cm:");
        raio = scanner.nextFloat();
        System.out.println("Insira a altura da lata em cm");
        altura = scanner.nextFloat();
        scanner.close();
        volume = PI * raio*raio*altura;
        System.out.printf("Volume da lata: %.2f cm³\n", volume);
        System.out.printf("Raio da lata: %.2f cm\n", raio);
        System.out.printf("Altura da lata: %.2f cm\n", altura);
    }
 }