package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1, n2, n3, n4, nota, media, nova_media;
		
		System.out.println("Qual a 1° nota do aluno");
		n1 = sc.nextFloat();
		System.out.println("Qual a 2° nota do aluno");
		n2 = sc.nextFloat();
		System.out.println("Qual a 3° nota do aluno");
		n3 = sc.nextFloat();
		System.out.println("Qual a 4° nota do aluno");
		n4 = sc.nextFloat();
		media = (n1 + n2 + n3 + n4)/4;
		if (media >= 7) {
			System.out.println("ALUNO APROVADO");
			System.out.println("Media: "+ media);
		}
		else {
			System.out.println("ALUNO REPROVADO");
			System.out.println("Media: "+ media);
			System.out.println("Qual a nota do exame?");
			nota = sc.nextFloat();
			nova_media = (nota + media) / 2;
			if (nova_media >= 5) {
				System.out.println("ALUNO APROVADO NO EXAME");
				System.out.println("Media do exame: "+ nova_media);
			}
			else {
				System.out.println("ALUNO REPROVADO");
				System.out.println("Media do exame"+ nova_media);
			}
				
			}
		}
			
		}