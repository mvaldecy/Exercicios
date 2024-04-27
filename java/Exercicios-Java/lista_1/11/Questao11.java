/*
 Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a
possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        int A, B, aux;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor A:");
        A = scanner.nextInt();
        System.out.println("Insira o valor B");
        B = scanner.nextInt();
        scanner.close();
        aux = A;
        A = B;
        B = aux;
        System.out.printf("Valor A - %d | Valor B - %d\n", A, B);
    }
}
