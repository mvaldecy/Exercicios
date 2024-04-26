/*
 * Ler  quatro  valores  numéricos  inteiros  e  apresentar  o  resultado  dois  a  dois  da  adição  e  multiplicação 
 * entre  os valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem
 * lidas as variáveis A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B 
com  D  e  por  último  C  com  D.  Note  que  para  cada  operação  serão  utilizadas  seis  combinações.  Assim  sendo, 
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as 
multiplicações.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int A, B, C, D;
        int i, j;
        ArrayList<String> letras= new ArrayList<String>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número A");
        A = scanner.nextInt();
        numeros.add(A);
        System.out.println("Insira o número B");
        B = scanner.nextInt();
        numeros.add(B);
        System.out.println("Insira o número C");
        C = scanner.nextInt();
        numeros.add(C);
        System.out.println("Insira o número D");
        D = scanner.nextInt();
        numeros.add(D);

        for (i = 0; i < numeros.size(); i++) {
            for (j = 0; j < numeros.size(); j++) {
                String letraA = letras.get(i);
                String letraB = letras.get(j);
                int numA = numeros.get(i);
                int numB = numeros.get(j);
                if (i < j) {
                    System.out.printf("%s + %s = %d\n", letraA, letraB, numA + numB);
                    System.out.printf("%s * %s = %d\n", letraA, letraB, numA * numB);
                }
            }
        }
    }
}
