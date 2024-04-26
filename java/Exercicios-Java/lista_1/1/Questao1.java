import java.util.Scanner;

/*
 * 1) Faça um programa para calcular o estoque médio de uma peça, sendo que: 
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 */

public class Questao1 {
    public static void main(String[] args) {
        int quantidade_min, quantidade_max;
        float quantidade_media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade mínima de itens:");
        quantidade_min = scanner.nextInt();
        System.out.println("Insira a quantidade máxima de itens:");
        quantidade_max = scanner.nextInt();
        quantidade_media = (quantidade_max + quantidade_min) / 2;
        scanner.close();
        System.out.printf("O estoque medio é %.2f itens\n", quantidade_media);

    }
}