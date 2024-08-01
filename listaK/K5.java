//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K5 {

	public static void main(String[] args) {
		int resp1 = 0, hcentro = 0, mcentro = 0, hleste = 0, mnorte = 0, moeste = 0, msul= 0;
		float pormcentro = 0,porM18 = 0, porHcl =0,porMnos =0;
		int totalcentro = 0, totalHcl = 0,  totalMnos = 0;
		int contHcl = 0, contMnos = 0;
		int H = 0, M =0;
		int conth18 = 0, contm18 = 0;
		
		do {
			int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua Idade?", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
			int regiao = Integer.parseInt(JOptionPane.showInputDialog(null, "Em qual Região você reside? (Centro =1, Leste=2, Norte=3, Oeste=4 ou Sul=5)", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu Sexo (Masculino =1, Feminino =2)?", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
			
			if (sexo == 1) {
				H++;
			}
			if (sexo == 2) {
				M++;
			}
			
			if (sexo==1 && regiao==1) {
				hcentro++;
			}else if (sexo==2 && regiao==1) {
				mcentro++;
			}
			
			
			if (sexo==1 && regiao==2) {
				hleste++;
			}
			
			
			if (sexo==2 && regiao==3) {
				mnorte++;
			}
			
			
			if (sexo==2 && regiao==4) {
				moeste++;
			}
			
			
			
			if(sexo == 1 && regiao == 1 && regiao ==2) {
				contHcl++;
			}
			if(sexo == 2 && regiao == 3 && regiao ==4 && regiao == 5 ) {
				contMnos++;
			}
			
			
			if (sexo==2 && regiao==5) {
				msul++;
			}
			
			if(age < 18 && sexo == 1 && regiao == 3) {
				conth18++;
			}
			if(age >= 18 && sexo == 2 && regiao == 4) {
				contm18++;
			}
			resp1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Gostaria de responder a pesquisa Novamente? (Sim = 1 , Não = 2)", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
		} while (resp1 == 1);
		

		totalcentro = mcentro + hcentro;

		totalHcl = hcentro + hleste;
		totalMnos = mnorte+ moeste + msul;

		
		if (moeste > 0) {
			porM18 = (100*contm18/moeste);

		}
		
		if (H > 0) {
			porHcl = (100*totalHcl/H);
		}
		
		if (M > 0) {
			porMnos = (100*totalHcl/M);
		}
		
		if (totalcentro > 0) {
		    pormcentro = (100 * mcentro / totalcentro);
		}


		JOptionPane.showMessageDialog(null, "total de Homens que moram na região do CENTRO e da ZONA LESTE: "+contHcl,"RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Percentual de Mulheres que moram na região NORTE , OESTE e SUL: "+porMnos+"%","RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Total de Homens menores de idade que moram na Região NORTE: "+conth18,"RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Percentual de Mulheres maiores de idade que moram na Região OESTE: "+porM18+"%","RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Percentual de Mulheres que moram na Região CENTRO: "+pormcentro+"%","RESULTADO" , JOptionPane.INFORMATION_MESSAGE);


	}

}
