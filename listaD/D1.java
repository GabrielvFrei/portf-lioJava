package listaD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2;
		
		System.out.println("Digite um numero");
		n1 = sc.nextFloat();
		System.out.println("Digite um outro numero");
		n2 =sc.nextFloat();
		if (n1 > n2) {
			System.out.println("O numero "+ n1 +" é maior que o numero "+ n2);
		}
		if (n2 > n1) {
			System.out.println("O numero "+ n2 +" é maior que o numero "+ n1);
		}	
	}

}
