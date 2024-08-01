package listaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Qual o codigo do funcionario");
		n1 = sc.nextInt();
		if (n1 == 1) {
			System.out.println("O funcionario faz parte do departamento de expedição");
		}
		if (n1 == 2) {
			System.out.println("O funcionario faz parte do departamento de recursos humanos");
		}
		if (n1 == 3) {
			System.out.println("O funcionario faz parte do departamento de logistica");
		}
		if (n1 == 4) {
			System.out.println("O funcionario faz parte do departamento de contabilidade");
		}
	}

}
