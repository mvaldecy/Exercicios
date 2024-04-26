/*
 * Faça um programa que: 
- Leia a cotação do dólar 
- Leia um valor em dólares 
- Converta esse valor para Real 
- Mostre o resultado 
 */

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        float cotacao_dolar, input_dolar, valor_real;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inira a cotação do dolar em real:");
        cotacao_dolar = scanner.nextFloat();
        System.out.println("Insira o valor em dolar a ser convertido em real");
        input_dolar = scanner.nextFloat();
        scanner.close();
        valor_real = cotacao_dolar * input_dolar;
        System.out.printf("O valor em real é R$ %.2f\n", valor_real);
        
    }
    
}
