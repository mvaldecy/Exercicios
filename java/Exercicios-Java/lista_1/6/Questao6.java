/*
 * Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de 
temperatura  a  ser  utilizada  é  F  =  (9  *  C  +  160)  /  5,  em  que  a  variável  F 
representa  é  a  temperatura  em  graus 
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
 */

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        int C;
        float F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em °C");
        C = scanner.nextInt();
        scanner.close();
        F = (9 * C + 190) / 5;
        System.out.printf("%d °C ---- %.0f °F\n", C, F);
    }
}
