package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		int N1, N2, N3, N4, N5, MENOR, MAIOR;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero: ");
		N1 = sc.nextInt();
		MAIOR = N1;
		MENOR = N1;
		System.out.println("Digite o segundo numero: ");
		N2 = sc.nextInt();
		if(N2 < MENOR) {
			MENOR = N2;
		}
		if (N2 > MAIOR);
			MAIOR = N2;
			
		System.out.println("Digite o terceiro numero: ");
		N3 = sc.nextInt();
		if(N3 < MENOR) {
			MENOR = N3;
		}
		if (N3 > MAIOR);
			MAIOR = N3;
		
		System.out.println("Digite o quarto numero: ");
		N4 = sc.nextInt();
		if(N4 < MENOR) {
			MENOR = N4;
		}
		if (N4 > MAIOR) {;
			MAIOR = N4;
		}
		System.out.println("Digite o quinto numero: ");
		N5 = sc.nextInt();
		if(N5 < MENOR) {
			MENOR = N5;
		}
		if (N5 > MAIOR) {;
			MAIOR = N5;
		}
		System.out.println("O maior numero foi: "+MAIOR);
		System.out.println("O menor numero foi: "+MENOR);
		
	}
}