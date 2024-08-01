package ex1PDF;

import javax.swing.JOptionPane;


public class Caixa {
	double saldo;
	double inp;
	double out;
	
	void entrada() {
		inp = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do saque?"));
		saldo = inp + saldo;
	}
	void retirada(){
		out = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da retirada?"));
		saldo = out - saldo;
	}
}
