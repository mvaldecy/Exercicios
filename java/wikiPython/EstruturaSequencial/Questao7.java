//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        float ladoQd, area, dobroArea;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado em cm no formato (X,XX):");
        ladoQd = scanner.nextFloat();
        area = ladoQd * ladoQd;
        dobroArea = area * 2;
        scanner.close();
        System.out.printf("Área do quadrado: %.2f cm².\n", area);
        System.out.printf("Dobro da área do quadrado: %.2f cm².\n", dobroArea);
    }
}
