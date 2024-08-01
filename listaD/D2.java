package listaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float n1;
		
		System.out.println("DIGITE UM NUMERO: ");
		n1 = sc.nextFloat();
		if (n1 > 100) {
			System.out.println("O numero é maior que 100");
		}
		if(n1 < 100) {
			System.out.println("O numero é menor que 100");
		}
	}
}
