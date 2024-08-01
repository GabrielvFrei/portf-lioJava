//Nome: Gabriel Alves de Freitas
package listaG;

import javax.swing.JOptionPane;

public class G2 {

	public static void main(String[] args) {
		String cod[] = {"10", "20", "30", "40","50", "60"};
		int opc;
		opc = JOptionPane.showOptionDialog(null, "Qual o codigo do seu departamento","ENTRADA", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		switch (opc) {
		case 0:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Expedição");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Recursos Humanos");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Logistica");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Contabilidade");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Departamento Pessoal");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Você é do departamento de Informatica");
			break;
			
		}
	}
}
