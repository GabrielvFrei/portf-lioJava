//Gabriel Alves de Freitas
package listaK;
	import java.util.Scanner;

import javax.swing.JOptionPane;
public class K2 {

	public static void main(String[] args) {
		double mulher=0,homem=0,sim=0,nao=0,total,percentual_mulher_nao,percentual_homem_sim;
		double mulher_sim=0,mulher_nao=0,homem_sim=0,homem_nao=0;
		int opc,opc2,opc3=0;
		Object[] cod1 = {"Homem","Mulher"};
		Object[] cod2 = {"Sim", "Não"};
		
		
		while(opc3 == 0) {
			opc = JOptionPane.showOptionDialog(null, "Escolha seu genero", "Entrada", 0, JOptionPane.QUESTION_MESSAGE, null, cod1,0);
	
			if(opc == 0) {
				homem++;
			}
			else if(opc == 1){
				mulher++;
			}
			
			opc2 = JOptionPane.showOptionDialog(null, "Escolha sua resposta", "Entrada", 0, JOptionPane.QUESTION_MESSAGE, null, cod2,0);
			
			if(opc2 == 0) {
				sim++;
				
			}
			else if(opc2 == 1) {
				nao++;
			}
			
			if(opc == 0 & opc2 == 0) {
				homem_sim++;
			}
			else if(opc==0 & opc2==1){
				homem_nao++;
			}
			if(opc==1 & opc2==0) {
				mulher_sim++;
			}
			else if(opc==1 & opc==1) {
				mulher_nao++;
			}
			
			opc3 = JOptionPane.showOptionDialog(null, "mais alguem?", "Entrada", 0, JOptionPane.QUESTION_MESSAGE, null, cod2,0);
		}
		if(opc3 == 1) {
			total = (homem+mulher);
			percentual_mulher_nao = (mulher_nao * 100/mulher);
			percentual_homem_sim = (homem_sim *100/homem);
			
			
			JOptionPane.showMessageDialog(null, "O total de pessoas que responderam sim "+sim+" .O total de pessoas que foram entrevistadas "+total+" O percentual de mulheres que votaram não "+percentual_mulher_nao+"%. O percentual de homens que votaram sim "+percentual_homem_sim+"%.", "  saida ", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}
