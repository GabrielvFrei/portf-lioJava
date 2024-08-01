package ex;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, perda1, perda2;
		
		System.out.println("Qual a quantidade de carvão que foi pedida pela siderúgica? ");
		n1 = sc.nextFloat();
		perda1 = (n1 * 2)/100;
		n1 = n1 + perda1;
		perda2 = (n1 * 3)/100;
		n1 = n1 + perda2;
		System.out.println("A quantidade ideal de carvão para que chegue a quantidade correta até a siderúgica é "+ n1 +" Quilos");
	}

}
