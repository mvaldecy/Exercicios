

/*
 Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTesteVetor
deverá ser criado um vetor para armazenar 30 objetos do tipo Lampada. O programa deverá exibir o seguinte
menu para o usuário:
1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair
 */

public class Lampada {
    int voltagem, potencia;
    String tipo, cor, marca;
    float preco;
    boolean ligada;

    // Construtor
    public Lampada(int voltagem, int potencia, String tipo, String cor, String marca, float preco) {
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.preco = preco;
        this.voltagem = voltagem;
        this.ligada = false;
    }

    // getters
    public String getCor() {
        return this.cor;
    }
    public String getMarca() {
        return this.marca;
    }
    public int getPotencia() {
        return  this.potencia;
    }
    public String getTipo() {
        return this.tipo;
    }
    public float getPreco() {
        return this.preco;
    }
    public int getVoltagem() {
        return this.voltagem;
    }
    public boolean getStatus() {
        return this.ligada;
    }

    //setters
    public void ascender() {
        this.ligada = true;
    }
    public void apagar() {
        this.ligada = false;
    }

    @Override
    public String toString() {
        return "Lampada Criada\n"
                .concat(String.format("Cor: %s\n", getCor()))
                .concat(String.format("Marca: %s\n", getMarca()))
                .concat(String.format("Potencia: %d W\n", getPotencia()))
                .concat(String.format("Tipo: %s\n", getTipo()))
                .concat(String.format("Preço: R$ %.2f\n", getPreco()))
                .concat(String.format("Voltagem: %d\n", getVoltagem()));
    }

}
