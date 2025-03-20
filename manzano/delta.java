package manzano;

import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		double a, b, c, x, raiz;
		boolean valido;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite um valor A da equação");
			a = sc.nextDouble();
			System.out.println("Digite um valor B da equação");
			b = sc.nextDouble();
			System.out.println("Digite um valor C da equação");
			c = sc.nextDouble();
			x = (b * b) - (4*(a*c));
			if (a == 0 || b == 0 || c == 0) {
				valido = false;
			}else {
				valido = true;
			}
			raiz = Math.sqrt(x);
		} while (valido == false);
			if (x > 0) {
				System.out.printf("As raizes são diferentes\n");
			}else if(x == 0){
				System.out.printf("As raizes são iguais\n");
			}else {
				System.out.printf("Não existem raizes real\n");
			}
			if (x > 0 || x == 0) {
				System.out.println("A raiz do delta é: "+raiz);
			}


	
		}
	}
