//Nome: Gabriel Alves de Frritas	
package listaG;

import javax.swing.JOptionPane;

public class G3 {

	public static void main(String[] args) {
		String cod[] = {"5", "15", "20", "25","30", "35"};
		int opc;
		float sal_atual, sal_novo, reajuste ;
		opc = JOptionPane.showOptionDialog(null, "Qual o codigo do funcionario?","Janela de consulta", 0, JOptionPane.QUESTION_MESSAGE, null, cod, cod[0]);
		sal_atual = Float.parseFloat(JOptionPane.showInputDialog("Qual o salario do funcionario?"));
		switch (opc) {
		case 0:
			reajuste = (sal_atual / 100) * 5;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		case 1:
			reajuste = (sal_atual / 100) * 10;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		case 2:
			reajuste = (sal_atual / 100) * 15;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		case 3:
			reajuste = (sal_atual / 100) * 20;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		case 4:
			reajuste = (sal_atual / 100) * 25;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		case 5:
			reajuste = (sal_atual / 100) * 30;
			sal_novo = sal_atual + reajuste;
			JOptionPane.showMessageDialog(null, "O salario antigo do funcionario era R$ "+ sal_atual +", O novo salario do funcionario é R$"+ sal_novo + ", e o reajuste foi de R$"+ reajuste);
			break;
		}
	}

}
