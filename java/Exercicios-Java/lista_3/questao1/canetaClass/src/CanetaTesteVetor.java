

import java.util.ArrayList;
import java.util.Scanner;


// botar cada case em um metodo
public class CanetaTesteVetor {
    public static  void main(String[] args) {
        boolean repeat = true;
        int option;
        String cor, marca, tamanho;
        ArrayList<Caneta> lista_canetas = new ArrayList<>(50);
        try (Scanner scanner = new Scanner(System.in)) {
            while (repeat) {
                System.out.println("1 - Cadastrar caneta");
                System.out.println("2 - Exibir todas as canetas");
                System.out.println("3 - Exibir quantidade de canetas cadastradas");
                System.out.println("4 - Consultar quantidade de canetas de uma determinada cor");
                System.out.println("0 - Sair");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Insira a marca");
                        marca = scanner.next();
                        System.out.println("Insira a cor");
                        cor = scanner.next();
                        System.out.println("Insira o tamanho");
                        tamanho = scanner.next();
                        lista_canetas.add(new Caneta(marca, cor, tamanho));
                        break;
                    case 2:
                        for (int i = 0; i < lista_canetas.size(); i++){
                            System.out.printf("%s\n", lista_canetas.get(i).toString());
                        }
                        break;
                    case 3:
                        System.out.printf("%d\n", lista_canetas.size());
                        break;
                    case 4:
                        System.out.println("Insira a cor desejada:");
                        int qtd_canetas = 0;
                        String pesquisa_cor = scanner.next();
                        for (int i = 0; i < lista_canetas.size(); i++) {
                            if (lista_canetas.get(i).getCor().equals(pesquisa_cor)) {
                                qtd_canetas += 1;
                            }
                        }
                        System.out.printf("%d canetas da cor %s\n", qtd_canetas, pesquisa_cor);
                        break;
                    case 0:
                        repeat = false;
                    default:
                        break;
                }
            }
        }
    }
}
