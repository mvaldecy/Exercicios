/*
 Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi
aprovado se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
do recuperação, somar com o valor da média e obter a nova média. Se a nova média for maior ou igual a 7,
apresentar uma mensagem informando que o aluno foi aprovado na recuperação. Se o aluno não foi aprovado,
apresentar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do
aluno.
 */

import java.util.Scanner;

public class Questao15 {

    public static float media (int soma_nota, int qtd_nota) {
        return soma_nota / qtd_nota;
    }
    public static void main(String[] args) {
        int soma_nota = 0;
        float media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira as 4 notas do aluno:");
        soma_nota += scanner.nextInt();
        soma_nota += scanner.nextInt();
        soma_nota += scanner.nextInt();
        soma_nota += scanner.nextInt();
        media = media(soma_nota, 4);
        if (media >= 7) {
            System.out.printf("Nota média: %.2f -- Aprovado\n", media);
        }
        else {
        System.out.println("Insira a nota de recuperação");
        soma_nota += scanner.nextInt();
        scanner.close();
        media = media(soma_nota, 5);
        if (media >= 7) {
            System.out.printf("Nota média: %.2f -- Aprovado\n", media);
        } else {
            System.out.printf("Nota média: %.2f -- Reprovado\n", media);
        }
    }
    }
}
