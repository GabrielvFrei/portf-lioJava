package listaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, menor, meio, maior;
		
		System.out.println("digite um numero");
		n1 = sc.nextFloat();
		menor = n1;
		meio = n1;
		maior = n1;
		System.out.println("digite outro numero");
		n2 = sc.nextFloat();
		if(n2 < menor) {
			menor = n2;
		}
		if(n2 > maior) {
			maior = n2;
		}
		
		System.out.println("digite outro numero");
		n3 = sc.nextFloat();
		if(n3 < menor) {
			menor = n3;
		}
		if (n3 > maior) {
			maior = n3;
		}
		if (n2 != menor & n2 != maior) {
			meio = n2;
		}
		if (n3 != menor & n3 != maior) {
			meio = n3;
		}
		System.out.println("A sequencia fica "+ menor +","+ meio +","+ maior);
	}

}
