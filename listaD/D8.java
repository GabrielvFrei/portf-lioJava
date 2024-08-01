package listaD;

import java.util.Scanner;

public class D8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, div; 
		
		System.out.println("digite um numero: ");
		n1 = sc.nextFloat();
		System.out.println("digite outro numero: ");
		n2 = sc.nextFloat();
		if (n2 > n1) {
			div = n2 / n1;
			System.out.println("O numero "+ n2 +" dividido pelo numero "+ n1 +" é igual a "+ div);
		}
		if (n1 > n2) {
			div = n1 / n2;
			System.out.println("O numero "+ n1 +" dividido pelo numero "+ n2 +" é igual a "+ div);
		}
		
	}

}
