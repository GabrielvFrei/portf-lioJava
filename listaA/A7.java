package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		float distancia, tempo, velocidade, litros_usados;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto tempo foi gasto (em horas) na viagem?: ");
		tempo = sc.nextFloat();
		System.out.println("Qual foi a velocidade media durante a viagem?: ");
		velocidade = sc.nextFloat();
		distancia = tempo * velocidade;
		litros_usados = distancia / 12;
		System.out.println("A velocidade media do carro foi de "+ velocidade +"KMh, foram gastas "+ tempo +" Horas na viagem, a distancia percorrida foi de "+ distancia +" quilometros, e foram gastos "+ litros_usados +" litros na viagem");
	}

}
