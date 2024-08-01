//Nome: Gabriel Alves de Freitas
package listaG;

import javax.swing.JOptionPane;

public class G1 {
	public static void main(String[] args) {
		String cod[] = {"1", "2", "3", "4","5"};
		int opc;
		opc = JOptionPane.showOptionDialog(null, "Qual o codigo do erro?","Janela de erro", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		switch (opc) {
		case 0:
			JOptionPane.showMessageDialog(null, "Identificador invalido");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Esperando Número Inteiro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Tipo de Dado indefinido");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Parâmetro Incorreto");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Memória Insuficiente");
			break;
		}
	}

}
