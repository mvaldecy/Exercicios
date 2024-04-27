

/*
 Implementar uma classe Caneta que deve possuir como características marca, cor e tamanho. Nesta classe
devem ser implementados os métodos construtores, getters, setters e toString. Em uma outra classe
chamada CanetaTesteVetor deverá ser criado um vetor para armazenar no máximo 50 objetos do tipo
Caneta. O programa deverá exibir o seguinte menu para o usuário:
1 – Cadastrar caneta
2 – Exibir todas as canetas
3 – Exibir quantidade de canetas cadastradas
4 – Consultar quantidade de canetas de uma determinada cor (digitada pelo usuário)
0 - Sair
 */

public class Caneta {
    String marca, cor, tamanho;
    public Caneta(String marca, String cor, String tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getCor() {
        return this.cor;
    }
    public String getTamanho() {
        return this.tamanho;
    }
    @Override
    public String toString() {
        return String.format("Marca: %s; Cor: %s; Tamanho: %s\n", marca, cor, tamanho);
    }
}
