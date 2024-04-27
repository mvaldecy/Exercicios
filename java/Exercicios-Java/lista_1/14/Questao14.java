/*
 14) Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
 */
import java.util.*;

public class Questao14 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois numeros inteiros");
        lista.add(scanner.nextInt());
        lista.add(scanner.nextInt());
        scanner.close();
        Collections.sort(lista);
        System.out.printf("%d\n", lista.get(1) - lista.get(0));
    }
}
