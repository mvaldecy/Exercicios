/*
 Escreva um programa que leia 3 números inteiros e imprima na tela os valores em ordem decrescente.
 */

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número A:");
        lista.add(scanner.nextInt());
        System.out.println("Insira o número B:");
        lista.add(scanner.nextInt());
        System.out.println("Insira o número C:");
        lista.add(scanner.nextInt());
        scanner.close();
        Collections.sort(lista, Collections.reverseOrder()); // https://www.javatpoint.com/how-to-sort-arraylist-in-java
        for(int i = 0; i < lista.size(); i ++){
            System.out.printf("\n%d\n", lista.get(i));
        }
    }
}
