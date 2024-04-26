/*
 * Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua 
comissão será de 5% do total da venda e que você tem os seguintes dados: 
- Identificação do vendedor 
- Código da peça 
- Preço unitário da peça 
- Quantidade vendida 
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int id_vendedor, id_peca, quantidade;
        float preco, total;
        double comissao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a identificação do vendedor");
        id_vendedor = scanner.nextInt();
        System.out.println("Insira a identificação da peça");
        id_peca = scanner.nextInt();
        System.out.println("Insira o preço unitário da peça");
        preco = scanner.nextFloat();
        System.out.println("Insira a quantidade de peças");
        quantidade = scanner.nextInt();
        total = quantidade * preco;
        comissao = total * 0.05;
        scanner.close();
        System.out.println("------------------------------");
        System.out.printf("Id Vendedor - %d\n", id_vendedor);
        System.out.printf("Id Peça vendida - %d\n", id_peca);
        System.out.printf("Quantidade de peças - %d und\n", quantidade);;
        System.out.printf("Valor total da venda - R$ %.2f\n", total);
        System.out.printf("Valor de comissão - R$ %.2f\n", comissao);
        System.out.println("------------------------------\n");

    }
}
