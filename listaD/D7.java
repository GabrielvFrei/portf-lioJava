package listaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();
		if (n1 == 5) {
			System.out.println("O numero é exatamente o cinco");	
		}
		if (n1 < 5) {
			System.out.println("O numero "+ n1 +" é menor que cinco");	
		}
		if (n1 > 10) {
			System.out.println("O numero "+ n1 +" é maior que dez");
		}
		if (n1 == 10) {
			System.out.println("O numero é exatamente o dez");
		}
		if (n1 > 5 & n1 < 10) {
			System.out.println("O numero está entre 5 e 10");
		}
		
	}

}
