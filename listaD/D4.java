package listaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float N1, N2, DIF;
		
		System.out.println("Digite um numero: ");
		N1 = sc.nextFloat();
		System.out.println("Digite um outro numero: ");
		N2 = sc.nextFloat();
		if(N1 > N2) {
			DIF = N1 - N2;
			System.out.println("A diferença entre o numero "+ N1 +" e o numero "+ N2 +" é "+ DIF);
		}
		if(N2 > N1);{
			DIF = N2 - N1;
			System.out.println("A diferença entre o numero "+ N2 +" e o numero "+ N1 +" é "+ DIF);
		}
	}
}
