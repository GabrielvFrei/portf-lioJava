package listaF;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		float salario, novo_salario, codigo, reajuste;
		
		System.out.println("Qual o salario do funcionario?");
		salario = sc.nextFloat();
		System.out.println("Qual o codigo do reajuste?");
		codigo = sc.nextFloat();
		if (codigo == 1) {
			reajuste = (salario / 100) * 5;
			novo_salario = salario + reajuste;
			System.out.println("o cargo do funcionario é OPERADOR, O novo salario do funcionario é R$"+ novo_salario +", O antigo salario do funcionario era R$"+ salario+ ", O reajuste teve um valor de R$"+ reajuste);
			}
		if (codigo == 2) {
			reajuste = (salario / 100) * 10;
			novo_salario = salario + reajuste;
			System.out.println("O cargo do funcionario é PROGRAMADOR, O novo salario do funcionario é R$"+ novo_salario +", O antigo salario do funcionario era R$"+ salario+ ", O reajuste teve um valor de R$"+ reajuste);
			}
		if (codigo == 3) {
			reajuste = (salario / 100) * 15;
			novo_salario = salario + reajuste;
			System.out.println("O cargo do funcionario é ANALISTAO, O novo salario do funcionario é R$"+ novo_salario +", O antigo salario do funcionario era R$"+ salario+ ", O reajuste teve um valor de R$"+ reajuste);
			}
		if (codigo == 4) {
			reajuste = (salario / 100) * 20;
			novo_salario = salario + reajuste;
			System.out.println("O cargo do funcionario é GERENTE, O novo salario do funcionario é R$"+ novo_salario +", O antigo salario do funcionario era R$"+ salario+ ", O reajuste teve um valor de R$"+ reajuste);
			}
	}

}
