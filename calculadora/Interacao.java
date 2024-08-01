package calculadora;

import javax.swing.JOptionPane;


public class Interacao {

	public int saberSinais() {
		String[] sinais = {"/","-","+","x"};
		return JOptionPane.showOptionDialog(null, "Escolha um sinal", "Sinais", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, sinais, sinais[0]);
	}
	public float pegarNum() {
		return Float.parseFloat(JOptionPane.showInputDialog("Digite um numero"));
	}
			
	
	
}
