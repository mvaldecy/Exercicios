/*
 * Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de 
temperatura  a  ser  utilizada  é  C  =  (F  -  32)  *  5  /  9,  em  que  a  variável  F  é  a  temperatura  em  graus  Fahrenheit  e  a 
variável C é a temperatura em graus Celsius.
 */

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        float C;
        float F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em °F");
        F = scanner.nextFloat();
        scanner.close();
        C = (F - 32) * 5 / 9;
        System.out.printf("%.0f °f ---- %.0f °F\n", F, C);
    }
}
