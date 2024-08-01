package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		
		float valor_f, valor_c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor em centigrados");
		valor_c = sc.nextFloat();
		valor_f = (9 * valor_c + 160)/5;
		System.out.println("O valor em Fahrenheit é: "+ valor_f);
		}

}
