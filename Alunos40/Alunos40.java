package Alunos40;
	
import java.util.Scanner;
	
public class Alunos40 {

	public static void main(String[] args) {
		float n1 , n2 ,n3 , n4 ,n5 ,n6 , med , r1 , r2, contap , contrec , contapex , contrex , contmedmaior , contmedmenor, contmediasala,  contmedex, contalunos;//contap = aprovados, contrec = recuperação, contapex = aprovados em exame, contrex = reprovado em exame, contmedmaior = media maior, contmedmenor = media menor, contmedsala = media da sala, contmedex = media exame		
		int contalun;
		Scanner sc = new Scanner(System.in);
		contalun = 1;
		contap = 0;
		contrec = 0;
		contapex = 0;
		contrex = 0;
		contmedmenor = 0;
		contmedmaior = 0;
		contalunos = 40;
		while (contalunos > 0) {
			System.out.println("Digite a nota do "+ contalun+ "º aluno");
			System.out.println("Digite a primeira nota do aluno");
			n1 = sc.nextFloat();
			System.out.println("Digite a segunda nota do aluno");
			n2 = sc.nextFloat();
			System.out.println("Digite a terceira nota do aluno");
			n3 = sc.nextFloat();
			System.out.println("Digite a quarta nota do aluno");
			n4 = sc.nextFloat();
			System.out.println("Digite a quinta nota do aluno");
			n5 = sc.nextFloat();
			System.out.println("Digite a sexta nota do aluno");
			n6 = sc.nextFloat();
			med = (n1 + n2 + n3 + n4 + n5 + n6)/6;
			if (med >= 7) {
				System.out.println("ALUNO APROVADO");
				if (med > contmedmaior) {
					contmedmaior = med;
				}
				if (med < contmedmenor) {
					contmedmenor = med;
				}
			if (med < 7) {
				System.out.println("Qual a nota que o aluno tirou no exame");
				r1 = sc.nextFloat();
				System.out.println("Qual a nota que o aluno tirou no segundo exame");
				r2 = sc.nextFloat();
				contmedex = (med + r1 + r2)/3;
				System.out.println(contmedex);
				if (contmedex >= 6) {
					System.out.println("ALUNO APROVADO POR EXAME");
				}
				if (contmedex <= 6) {
					System.out.println("ALUNO REPROVADO POR EXAME");
				}
				contalun ++;
				}
			}
		
		}
		System.out.println("ALUNOS APROVADOS EM EXAME: "+contapex);
		System.out.println("ALUNOS REPROVADOS EM EXAME: "+contrex);
		System.out.println("ALUNOS APROVADOS SEM EXAME: "+contap);

	}
}
