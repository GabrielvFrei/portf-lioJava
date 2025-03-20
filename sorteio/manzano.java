package sorteio;

import java.util.Scanner;

public class manzano {

	public static void main(String[] args) {
		double salario, novoSalario;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual o salario do funcionario");
		salario = sc.nextDouble();
		if (salario < 500) {
			novoSalario = salario * 1.15;
		}else {
			if (salario <= 1000) {
				novoSalario = salario * 1.10;
			}else {
				novoSalario = salario * 1.05;
			};
		}
		System.out.printf("O novo salario do funcionario é: %.2f%n", novoSalario);
	}

}
