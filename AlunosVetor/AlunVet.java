//Gabriel Alves de Freitas
package AlunosVetor;

import javax.swing.JOptionPane;

public class AlunVet {

		public static void main(String[] args) {
		
			int qtd_alunos,qtd_notas,nota_min,nota_max,notas_exame,nota_max_exame,nota_min_exame,nota_conta=0;
			int aprov_direto=0, reprov_direto=0,aprov_exame=0, reprov_exame=0, aprovados,reprovados,exame=0,qtd_exame=0;
			float porcentagem_aprov_direto,porcentagem_reprov_direto,porcentagem_alunos_exame_aprov,porcentagem_alunos_exame_reprov,total = 0,media_geral,media_sala=0;
			float maior_media=0,menor_media=10,acima=0,igual=0,abaixo=0;
			
			
			qtd_alunos = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos alunos têm a turma?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			qtd_notas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas notas têm cada aluno?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			nota_min = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a nota mínima para aprovação direta?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			nota_max = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a nota máxima para reprovação direta?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			notas_exame = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas notas serão o exame?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			nota_min_exame = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a nota mínima para a aprovação em exame?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			nota_max_exame = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a nota máxima para a reprovação em exame?","ENTRADA",JOptionPane.QUESTION_MESSAGE));
			
			int nota[] = new int[qtd_notas];
			int nota_exame[] = new int[notas_exame];
			
			
			float media[] = new float [qtd_alunos];{
				
			for (int i = 0;i <= (qtd_alunos-1);i++) {
					
				nota_conta = 0;
				exame = 0;
				for(int b = 0;b <= (qtd_notas-1);b++) {
					nota[b] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a nota","ENTRADA",JOptionPane.QUESTION_MESSAGE));
					nota_conta += nota[b];
					
					
				}
				media[i] = nota_conta/qtd_notas;
				
				System.out.println(i + " Aluno");
				System.out.println(media[i] + " Aluno "+i);
				if ( media[i] >= nota_min) {
					aprov_direto++;
				}
				
				else if (media[i] <= nota_max) {
					reprov_direto++;
				}
				else {
					exame++;
					qtd_exame++;
				}
				if(exame==1) {
					for(int c = 0; c <= (notas_exame-1);c++) {
						nota_exame[c] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a nota do exame","ENTRADA",JOptionPane.QUESTION_MESSAGE));
						media[i] = (media[i] + nota_exame[c])/2;
					}
					if(media[i] >= nota_min_exame) {
						aprov_exame++;
					}
					else if(media[i] <= nota_max_exame) {
						reprov_exame++;
					}
						
				}
				if(media[i] >= maior_media) {
					maior_media = media[i];
				}
				if(media[i] <= menor_media) {
					menor_media = media[i];
				}
					
				 
			}
			aprovados = aprov_direto+aprov_exame;
			reprovados = reprov_exame+ reprov_direto;
			total = aprovados + reprovados;
			
			porcentagem_aprov_direto = (aprov_direto/total)*100;
			porcentagem_reprov_direto = (reprov_direto/total)*100;
			porcentagem_alunos_exame_aprov = (aprov_exame/qtd_exame)*100;
			porcentagem_alunos_exame_reprov = (reprov_exame/qtd_exame)*100;
			
			for(int d=0;d <= (qtd_alunos-1);d++) {
				media_sala += media[d]; 
			}
			media_geral = media_sala/qtd_alunos;

			for (int e =0;e<= (qtd_alunos-1);e++) {
				if(media[e] > media_geral) {
					acima++;
				}
				else if (media[e] < media_geral) {
					abaixo++;							
				} else {
					igual++;
				}

			}
			
			JOptionPane.showMessageDialog(null, "quantidade de alunos aprovados "+aprovados,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos reprovados "+reprovados,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos aprovados em exame "+aprov_exame,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos reprovados em exame "+reprov_exame,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos aprovados direto "+aprov_direto,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos reprovados direto "+reprov_direto,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Percentual de alunos aprovados em exame "+porcentagem_alunos_exame_aprov,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Percentual de alunos reprovados em exame"+porcentagem_alunos_exame_reprov,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "media geral da turma "+media_geral,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "maior media obtida por aluno na turma "+maior_media,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "menor media obtida por aluno na turma "+menor_media,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos que tiveram a media acima da turma "+acima,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos que tiveram a media abaixo da turma"+abaixo,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "quantidade de alunos que tiveram a media igual a media da turma "+igual,"SAIDA",JOptionPane.INFORMATION_MESSAGE);
			
			
			
		}

		}
	}