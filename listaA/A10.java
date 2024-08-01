package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float A, B, C;
		System.out.println("Digite um numero para a variavel A: ");
		A = sc.nextFloat();
		System.out.println("Digite um outro numero para a variavel B: ");
		B = sc.nextFloat();
		C = A;
		A = B;
		B = C;
		System.out.println("A variavel A contem o numero "+ A +" e a variavel B contem o numero "+ B);
		
	

	}

}
