//Gabriel Alves de Freitas
package alunosnota;

import java.util.Scanner;

public class Alunos40Nota {

	public static void main(String[] args) {{
		float n1, mediasala = 0 , n2 ,n3 , n4 ,n5 ,n6 , med , r1 , r2 , contrec , contmedmaior = 0 , contmedmenor = 10, contmediasala = 0,  contmedex, contalunos = 40;//contap = aprovados, contrec = recuperação, contapex = aprovados em exame, contrex = reprovado em exame, contmedmaior = media maior, contmedmenor = media menor, contmedsala = media da sala, contmedex = media exame	
		int contalun = 1, contrex = 0, contapex = 0, contap = 0;
		contalunos = 40;
		Scanner sc = new Scanner(System.in);
			
		while (contalunos > 0) {
			System.out.println("Digite a primeira nota do "+contalun+" º aluno");
			n1 = sc.nextFloat();
			System.out.println("Digite a segunda nota do "+contalun+" º aluno");
			n2 = sc.nextFloat();
			System.out.println("Digite a terceira nota do "+contalun+" º aluno");
			n3 = sc.nextFloat();
			System.out.println("Digite a quarta nota do "+contalun+" º aluno");
			n4 = sc.nextFloat();
			System.out.println("Digite a quinta nota do "+contalun+" º aluno");
			n5 = sc.nextFloat();
			System.out.println("Digite a sexta nota do "+contalun+" º aluno");
			n6 = sc.nextFloat();
			med = (n1 + n2 + n3 + n4 + n5 + n6)/6;
			if (med >= 7) {
				contap ++;
				System.out.println("ALUNO APROVADO");
				if (med > contmedmaior) {
					contmedmaior = med;
				}
				if (med < contmedmenor) {
					contmedmenor = med;
				}
			}else {
				System.out.println("Qual a nota que o aluno tirou no exame? ");
				r1 = sc.nextFloat();
				System.out.println("Qual a segunda nota que o aluno tirou no exame? ");
				r2 = sc.nextFloat();
				contmedex = (r1 + r2 + med)/3;
				if (contmedex >= 7) {
					System.out.println("Aluno Aprovado por exame");
					contapex ++;
				} else {
					System.out.println("Aluno Reprovado por exame");
					contrex ++;
				}
				if (med < contmedmenor) {
					contmedmenor = med;
				}
				if (med > contmedmaior) {
					contmedmaior = med;
				}	
			}		
			contalun ++;
			contalunos --;
			contmediasala = contmediasala + med;
		}
		mediasala = (contmediasala)/40;
		System.out.println("Alunos Reprovados: "+contrex);
		System.out.println("Alunos Aprovados por Exame: "+contapex);
		System.out.println("Alunos Aprovados Direto: "+contap);
		System.out.println("A maior media de um aluno foi: "+contmedmaior);
		System.out.println("A menor media de um aluno foi: "+contmedmenor);			
		System.out.println("A media da sala é: "+mediasala);
		}
	}
	}
