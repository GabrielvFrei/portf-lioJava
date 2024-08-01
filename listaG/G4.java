//Nome: Gabriel Alves de Freitas
package listaG;

import javax.swing.JOptionPane;

public class G4 {

	public static void main(String[] args) {
		String cod[] = {"1", "2", "3", "4"};
		int opc;
		float sal_atual, sal_novo, reajuste ;
		opc = JOptionPane.showOptionDialog(null, "Qual o codigo do funcionario?","Janela de consulta", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		sal_atual = Float.parseFloat(JOptionPane.showInputDialog("Qual o salario do funcionario?"));
		switch (opc) {
		case 0:
			reajuste = (sal_atual / 100) * 5;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste +" O cargo do funcionario é Operador");
			break;
		case 1:
			reajuste = (sal_atual / 100) * 10;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste +" O cargo do funcionario é Programador");
			break;
		case 2:
			reajuste = (sal_atual / 100) * 15;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste +" O cargo do funcionario é Analista");
			break;
		case 3:
			reajuste = (sal_atual / 100) * 25;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste + " O cargo do funcionario é Gerente");
			break;
		}
	}

}