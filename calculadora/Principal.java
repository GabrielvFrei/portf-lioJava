package calculadora;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Interacao Interacao = new Interacao();
		Calculo Calc = new Calculo();
		String opc[] = {"Sair", "Continuar"};
		
		//Interacao.saberSinais();
		//Interacao.pegarNum();
		
		//System.out.println(Calc.bla(Interacao.pegarNum(),Interacao.saberSinais(),Interacao.pegarNum()));
		do {
		JOptionPane.showMessageDialog(null, "Resultado: "+Calc.bla(Interacao.pegarNum(),Interacao.saberSinais(),Interacao.pegarNum()),
		"RESULTADO", JOptionPane.QUESTION_MESSAGE);
		}while(JOptionPane.showOptionDialog(null, "O que deseja fazer?", "JANELA", 0, JOptionPane.ERROR_MESSAGE, null, opc, opc[0]) != 0);
	}

}
