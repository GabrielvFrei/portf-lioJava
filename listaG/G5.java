//Nome: Gabriel Alves de Freitas
package listaG;

import javax.swing.JOptionPane;

public class G5 {

	public static void main(String[] args) {
		String cod[] = {"6 � 8 anos", "9 � 11 anos", "12 �13 anos", "14 � 15 anos","16 � 17 anos", "18 � 20 anos"};
		int opc;
		opc = JOptionPane.showOptionDialog(null, "Qual a idade da crian�a","Janela de consulta", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		switch (opc) {
		case 0:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Dente de lente");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Pr�-Mirim");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Mirim");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Infantil");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Juvenil");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "A categoria da crian�a � Juniores");
			break;
		}
	}

}