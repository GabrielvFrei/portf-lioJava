package ex;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, perda1, perda2;
		
		System.out.println("Qual a quantidade de carv�o que foi pedida pela sider�gica? ");
		n1 = sc.nextFloat();
		perda1 = (n1 * 2)/100;
		n1 = n1 + perda1;
		perda2 = (n1 * 3)/100;
		n1 = n1 + perda2;
		System.out.println("A quantidade ideal de carv�o para que chegue a quantidade correta at� a sider�gica � "+ n1 +" Quilos");
	}

}
