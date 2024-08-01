package listaA;

import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		float n1, n2, n3, n4, soma, media;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = sc.nextFloat();
		System.out.println("Escreva o segundo valor");
		n2 = sc.nextFloat();
		System.out.println("Escreva o terceiro valor");
		n3 = sc.nextFloat();
		System.out.println("Escreva o quarto valor");
		n4 = sc.nextFloat();
		
		
		soma = (n1 + n2 + n3 + n4);
		media = (soma/4);
		
		System.out.println("A media dos valores é: " + media + ".");
	}

}
