//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K3 {

	public static void main(String[] args) {
		int contHe = 0;
		int contMp = 0;
		int contmu = 0;
		int contho = 0;
		int contEC = 0;
		int contADM = 0;
		int contMED = 0;
		int contPS = 0;
		int contHadm = 0;
		int contMmed = 0;
		float prtgMED = 0;
		float prtgMadm = 0;
		float prtgMmed = 0;
		float prtgHec = 0;
		float prtgMp = 0;
		int cont = 1;
		int totalMed = 0;
		int resp1= 0;
		int contMadm = 0;
		
		do {
			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu Sexo? Masculino:1 Feminino:2 ", "SEXO", JOptionPane.QUESTION_MESSAGE));
			int resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Código do Curso: ", "CÓDIGO DO CURSO", JOptionPane.QUESTION_MESSAGE));
			
			if(sexo==1) {
				contho++;
			}else if(sexo==2) {
				contmu++;
			}
			
			if(resp == 1) {
				contEC++;
			}else if(resp == 2) {
				contADM++;
			}else if(resp == 3) {
				contMED++;
			}else if(resp == 4) {
				contPS++;
			}
			
			if (sexo == 1 && sexo == 2 && resp == 3) {
				totalMed++;
			}
			
			if(sexo==1 && resp==1 ) {
				contHe++;
			}else if(sexo==2 && resp==4) {
				contMp++;
			}else if(sexo==1 && resp==2) {
				contHadm++;
			}else if(sexo==2 && resp==3) {
				contMmed++;
			}else if(sexo == 2 && resp == 2) {
				contMadm++;
			}
			
			cont++;
			
			resp1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Gostaria de responder novamente?(Sim=1; Não=2;)", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
		} while (resp1 == 1);
		
		
		prtgMp = (100*contMp/contmu);
		prtgHec = (100*contHe/contho);
		prtgMadm = (100*contMadm/contmu);
		prtgMmed = (100*contMmed/contmu);
		
		JOptionPane.showMessageDialog(null, prtgHec+"% Percentual de homens que pretendem cursar Engenharia da Computação", "PESQUISA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prtgMp+"% O Percentual de mulheres que pretendem cursar Psicologia;", "PESQUISA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, totalMed+" O total de pessoas que pretendem cursar Medicina", "PESQUISA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prtgMadm+"% O total de mulheres que pretendem cursar Administração.", "PESQUISA", JOptionPane.INFORMATION_MESSAGE);
	}

}
