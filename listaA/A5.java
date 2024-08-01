package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		float preco_bruto, desconto, preco_vista;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Preço do produto");
		preco_bruto = sc.nextFloat();
		desconto = (preco_bruto/100) * 10;
		preco_vista = preco_bruto - desconto;
		System.out.println("O preço do produto é: R$"+ preco_bruto +", o preço com o desconto a vista de R$"+ desconto +" é R$"+ preco_vista);

	}

}
