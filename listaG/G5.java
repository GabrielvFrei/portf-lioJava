//Nome: Gabriel Alves de Freitas
package listaG;

import javax.swing.JOptionPane;

public class G5 {

	public static void main(String[] args) {
		String cod[] = {"6 à 8 anos", "9 à 11 anos", "12 à13 anos", "14 à 15 anos","16 à 17 anos", "18 à 20 anos"};
		int opc;
		opc = JOptionPane.showOptionDialog(null, "Qual a idade da criança","Janela de consulta", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		switch (opc) {
		case 0:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Dente de lente");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Pré-Mirim");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Mirim");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Infantil");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Juvenil");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "A categoria da criança é Juniores");
			break;
		}
	}

}