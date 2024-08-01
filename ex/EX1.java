package ex;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valor_custo, valor_sugerido, desco;
		
		System.out.println("Valor de custo: ");
		valor_custo = sc.nextFloat();
		desco = (valor_custo * 35)/100;
		valor_sugerido = valor_custo + desco;
		System.out.println("o valor sugerido para a venda do produto é: "+ valor_sugerido);
	}
}
