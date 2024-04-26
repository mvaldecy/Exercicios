/*
 * Efetuar o cálculo da quantidade  de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
12  Km  por  litro.  Para  obter  o  cálculo,  o  usuário  deve  fornecer  o  tempo  gasto  na  viagem  e  a  velocidade  média. 
Desta  forma,  será  possível  obter  a  distância  percorrida  com  a  fórmula  DISTANCIA  =  TEMPO  *  VELOCIDADE. 
Tendo  o  valor  da  distância,  basta  calcular  a  quantidade  de  litros  de  combustível  utilizada  na  viagem  com  a 
fórmula:  LITROS_USADOS  =  DISTANCIA  /  12.  O  programa  deve  apresentar  os  valores  da  velocidade  média, 
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 */

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        float tempo_viagem, v_media, litros_gastos, distancia;
        int consumo = 12; // 12km/l
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tempo total da vigem em horas:");
        tempo_viagem = scanner.nextFloat();
        System.out.println("Insira a velocidade média em Km/h:");
        v_media = scanner.nextFloat();
        scanner.close();
        distancia = tempo_viagem * v_media;
        litros_gastos = distancia / consumo;
        System.out.printf("Velocidade média - %.0f Km/h\n", v_media);
        System.out.printf("Tempo gasto - %.0f h\n", tempo_viagem);
        System.out.printf("Distancia percorrida - %.0f Km\n", distancia);
        System.out.printf("Litros gastos - %.0f L\n", litros_gastos);
    }
    
}
