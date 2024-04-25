//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número");
        int inputNum = scanner.nextInt();
        scanner.close();
        System.out.println(String.format("O número informado foi %d", inputNum));
    }
}
