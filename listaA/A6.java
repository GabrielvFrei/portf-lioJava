package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {	
		float HT, VH, PD, SB, TD, SL = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe as horas trabalhadas: ");
		HT = sc.nextFloat();
		System.out.println("Valor da hora trabalhada: ");
		VH = sc.nextFloat();
		System.out.println("Percentural de desconto");
		PD = sc.nextFloat();
		SB = HT * VH;
		TD = (PD / 100) * SB;
		SL = SB - TD;
		System.out.println("O salario liquido do funcionario é R$"+ SL +", O salario bruto é R$"+ SB +" e o desconto retirado do salario é R$"+ TD);
	}
}