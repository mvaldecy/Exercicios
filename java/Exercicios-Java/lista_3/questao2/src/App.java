
import java.util.ArrayList;
import java.util.Scanner;


// botar cada fluxo em metodo e chamar no app
public class App {
  public static void main(String[] args) {
		boolean repeat = true;
		int option;
		ArrayList<Lampada> list = new ArrayList<>();
		Controller controller = new Controller(list);
		Scanner scanner = new Scanner(System.in);
		while(repeat) {
			System.out.println("1 – Cadastrar lâmpada");
			System.out.println("2 – Exibir todas as lâmpadas");
			System.out.println("3 – Exibir quantidade de lâmpadas cadastradas");
			System.out.println("4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)");
			System.out.println("5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas");
			System.out.println("6 – Exibir a quantidade de lâmpadas acesas e apagadas");
			System.out.println("0 – Sair");
			option = scanner.nextInt();
			switch (option) {
				case 1:
				controller.PostLampada();	
				break;
				case 2:
				controller.getAll();
				break;
				case 3:
				controller.getQuantity();
				break;
				case 4:
				System.out.println("Insira a potencia");
				int input = scanner.nextInt();
				controller.findByPotencia(input);
				break;
				case 5:
				controller.getByPrice();
				break;
				case 6:
				controller.getStatus();
				case 0:
				repeat = false;
				break;
				default:
				break;
			}
		}
		scanner.close();

  }
}
/*
 * 1 – Cadastrar lâmpada
2 – Exibir todas as lâmpadas
3 – Exibir quantidade de lâmpadas cadastradas
4 – Consultar quantidade de lâmpadas de uma determinada potência (digitada pelo usuário)
5 – Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas
6 – Exibir a quantidade de lâmpadas acesas e apagadas
0 - Sair
 */
