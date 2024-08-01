package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, media;
		
		System.out.println("Qual a 1° nota do aluno");
		n1 = sc.nextFloat();
		System.out.println("Qual a 2° nota do aluno");
		n2 = sc.nextFloat();
		System.out.println("Qual a 3° nota do aluno");
		n3 = sc.nextFloat();
		System.out.println("Qual a 4° nota do aluno");
		n4 = sc.nextFloat();
		media = (n1 + n2 + n3 + n4)/4;
		if (media >= 5) {
			System.out.println("ALUNO APROVADO");
			System.out.println("Media: "+ media);
		}
		else {
			System.out.println("ALUNO REPROVADO");
			System.out.println("Media: "+ media);
		}
			
		}

	}

