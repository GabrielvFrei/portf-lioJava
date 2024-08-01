package listaA;

import java.util.Scanner;

public class A2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		float lado1, lado2, area;
		
		System.out.println("Escreva o valor de um dos lados do retangulo");
		lado1 = sc.nextFloat();
		System.out.println("Escreva o valor do outro lado do retangulo");
		lado2 = sc.nextFloat();
		area = lado1 * lado2;
		System.out.println("Area do retangulo é: "+ area);		
	}

}
