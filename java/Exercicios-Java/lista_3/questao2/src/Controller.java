
import java.util.ArrayList;
import java.util.Scanner;

/*
 * /*
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


public class Controller {
	ArrayList<Lampada> listaLampadas;

	public Controller(ArrayList<Lampada> listaLampadas) {
		this.listaLampadas = listaLampadas;
	}

  public void PostLampada() {
    int voltagem, potencia;
    String tipo, cor, marca;
    float preco;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira a voltagem da lampada");
    voltagem = scanner.nextInt();
    System.out.println("Insira a potencia da lampada");
    potencia = scanner.nextInt();
    System.out.println("Insira o tipo da lampada");
		tipo = scanner.next();
		System.out.println("Insira a cor da lampada");
		cor = scanner.next();
		System.out.println("Insira a marca da lampada");
		marca = scanner.next();
		System.out.println("Insira o preço da lampada");
		preco = scanner.nextFloat();

		Lampada newLampada = new Lampada(voltagem, potencia, tipo, cor, marca, preco);
		listaLampadas.add(newLampada);
		System.out.print(newLampada.toString() + "\n");
		
  }
  
  // fluxo 2
  public void getAll() {
    listaLampadas.stream().forEach(lampada -> System.out.print(lampada.toString() + "\n"));
  }

  // fluxo 3
  public void getQuantity() {
    System.out.print(listaLampadas.size() + "\n");
  }

  // fluxo 4
  public void findByPotencia(int potencia) {
    int quantity = (int) listaLampadas.stream()
              .filter( p -> p.potencia == potencia).count();
    System.out.print(quantity + "\n");
  }

  //fluxo 5
  public void getByPrice() {
    // loat media =  listaLampadas.stream().reduce((subtotal, accumulator) -> subtotal.getPreco() + accumulator.getPreco());
    float soma = 0;
    soma = (float) listaLampadas.stream().mapToDouble(Lampada::getPreco).sum();
    float media =  soma / listaLampadas.stream().count();
    listaLampadas.stream().filter(lampada -> lampada.getPreco() < media).forEach( lampada -> System.out.print(lampada.toString()+ "\n"));
  }

  //fluxo 6
  public void getStatus() {
    int acesas = (int) listaLampadas.stream().filter(lampada -> lampada.ligada == true).count();
    int apagadas = (int) listaLampadas.stream().filter(lampada -> lampada.ligada == false).count();
    System.out.printf("Lamapadas acesas: %d\n", acesas);
    System.out.printf("Lampadas desligadas: %d\n", apagadas);
  }


}

  

/*
 * public Lampada(int voltagem, int potencia, String tipo, String cor, String marca, float preco) {
        this.cor = cor;
        this.marca = marca;
        this.potencia = potencia;
        this.tipo = tipo;
        this.preco = preco;
        this.voltagem = voltagem;
        this.ligada = false;
    }
 */
