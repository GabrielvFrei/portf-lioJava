package AlunosVetor;

import java.util.Scanner;

public class AlunVetor {

	public static void main(String[] args) {
		float media = 0, notamin, notamax, notaexamemin, notaexamemax, mediaexame;
		int c = 1, caluno = 1, alunos, numnotas, numnotaexame, contaprovadodireto, contreprovadodireto, contaprovadoexame, contreprovadoexame, contacimamedia, contabaixomedia, contigualmedia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos a turma tem? ");
		alunos = sc.nextInt();
		System.out.println("Quantas notas tem cada aluno? ");
		numnotas = sc.nextInt();
		System.out.println("Qual a nota mínima para a aprovação direta? ");
		notamin = sc.nextFloat();
		System.out.println("Qual a nota máxima para a aprovação direta? ");
		notamax = sc.nextFloat();
		System.out.println("Quantas notas serão o exame? ");
		numnotaexame = sc.nextInt();
		System.out.println("Qual a nota mínima para aprovação em exame? ");
		notaexamemin = sc.nextFloat();
		System.out.println("Qual a nota máxima para reprovação em exame? ");
		notaexamemax = sc.nextFloat();
		
		int numalunos[] = new int[alunos];
		float medialunos[]= new float[alunos];
		float notaalunos[] = new float[numnotas];
		for (int i = 0; i < numalunos.length; i++) {
			for (int j = 0; j < notaalunos.length; j++) {
				System.out.println("Qual a "+ c +"º nota do "+caluno+"º aluno");
				notaalunos[i] = sc.nextFloat();
				for (int j2 = 0; j2 < notaalunos.length; j2++) {
					medialunos[i] = sc.nextFloat();
				}
				c ++;
			}
			numalunos[i] = sc.nextInt();
			for (int m = 0; m < numalunos.length; m++) {
				media = media + medialunos[m];
			}
			c = 1;
			caluno++; 
		}
		System.out.println(media);
	}

}
