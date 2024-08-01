//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K4 {

	public static void main(String[] args) {	
		int contS = 0;
		int contN = 0;
		int contF = 0;
		int contM = 0;
		int contmu = 0;
		int contho = 0;
		int contFN = 0;
		int contMS = 0;
		float prtgM = 0;
		float prtgH = 0;
		int cont = 1;
		int resp1 = 0;
		
		
		do {

			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual seu Sexo? Masculino:1 Feminino:2 ", "SEXO", JOptionPane.QUESTION_MESSAGE));
			int resp  = JOptionPane.showConfirmDialog(null, "Você gostou do novo produto lançado?", "PESQUISA DE MERCADO", JOptionPane.YES_NO_OPTION);
			if(sexo==1) {
				contho++;
			}else if(sexo==2) {
				contmu++;
			}
			
			if(resp == 0) {
				contS++;
			}else if(resp == 1) {
				contN++;
			}
			
			if(sexo==2 && resp==0 ) {
				contF++;
			}else if(sexo==1 && resp==1) {
				contM++;
			}
			
			if(sexo==2 && resp==0 ) {
				contFN++;
			}else if(sexo==1 && resp==1) {
				contMS++;
			}
			
			
			cont++;
			resp1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Gostaria de responder a pesquisa Novamente? (Sim = 1 , Não = 2)", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
		} while (resp1 == 1);
		
		
		prtgM = (100*contFN/contmu);
		prtgH = (100*contMS/contho);
		
		JOptionPane.showMessageDialog(null, contF, "Nº de mulheres que disseram sim", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, contM, "Nº de Homens que disseram não", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prtgM+"%", "Nº de MULHERES que disseram sim", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prtgM+"%", "Nº de HOMENS que disseram não", JOptionPane.INFORMATION_MESSAGE);
	}

}
