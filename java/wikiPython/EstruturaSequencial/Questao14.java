/*
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
 * rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
 * que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
 * pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
 * que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso
 * a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
 * Imprima os dados do programa com as mensagens adequadas.
 */

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso_peixe, excedente, multa;
        System.out.println("Insira o peso do peixe:");
        peso_peixe = scanner.nextFloat();
        excedente = peso_peixe - 50.00;
        multa = excedente * 4;
        System.out.printf("Peso lido: %.2f Kg\n", peso_peixe);
        System.out.printf("Peso Excedente: %.2f Kg\n", excedente);
        System.out.printf("Multa: R$ %.2f\n", multa);
    }
    
}
