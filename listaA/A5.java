package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		float preco_bruto, desconto, preco_vista;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Pre�o do produto");
		preco_bruto = sc.nextFloat();
		desconto = (preco_bruto/100) * 10;
		preco_vista = preco_bruto - desconto;
		System.out.println("O pre�o do produto �: R$"+ preco_bruto +", o pre�o com o desconto a vista de R$"+ desconto +" � R$"+ preco_vista);

	}

}
