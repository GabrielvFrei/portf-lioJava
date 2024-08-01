package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual a idade da criança");
		idade = sc.nextInt();
		if (idade >= 6 & idade <= 8) {
			System.out.println("A categoria da criança é DENTE DE LEITE");
			
		}
		if (idade >= 9 & idade <= 11) {
			System.out.println("A categoria da criança é PRÉ-MIRIM");
		}
		if (idade >= 12 & idade <= 13){
			System.out.println(" A categoria da criança é MIRIM");
		
		}
		if (idade >= 14 & idade <=15) {
			System.out.println(" A categoria da criança é INFANTIL");
		}
		if (idade >= 16 & idade <=17) {
			System.out.println(" A categoria da criança é JUVENIL");
		}
		if (idade >= 18 & idade <=20)
			System.out.println(" A categoria da criança é JUNIORES");
	
		}
}
