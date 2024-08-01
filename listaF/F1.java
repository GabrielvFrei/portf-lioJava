package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Qual o codigo do funcionario");
		n1 = sc.nextInt();
		if (n1 == 10) {
			System.out.println("O funcionario faz parte do departamento de contabilidade");
		}
		if (n1 == 12) {
			System.out.println("O funcionario faz parte do departamento de almoxarifado");
		}
		if (n1 == 14) {
			System.out.println("O funcionario faz parte do departamento de informatica");
		}
	}

}
