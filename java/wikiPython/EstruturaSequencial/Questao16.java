/*
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
 * quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
 * cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class Questao16 {
   public static void main(String[] args) {
    int custo_lata = 80;
    int tamanho_lata = 18;
    double area_pintada, custo, latas;
    // int latas;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a quantidade em m² da área a ser pintada");
    area_pintada = scanner.nextFloat();
    scanner.close();
    latas = Math.ceil((area_pintada*3)/tamanho_lata);
    custo = custo_lata * latas;
    System.out.printf("Quantidade de latas: %.0f ---- Custo total = R$ %.2f\n", latas, custo);
   } 
}
