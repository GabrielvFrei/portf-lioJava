package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		float raio, alt;
		double vol;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o raio da lata");
		raio = sc.nextFloat();
		System.out.println("Escreva a altura da lata (em metros)");
		alt = sc.nextFloat();
		vol = 3.14159 * raio * raio * alt;
		System.out.println("O volume da lata de oléo é igual a: " + vol + " m3");
	}

}
