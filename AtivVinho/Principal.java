package AtivVinho;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Vinho vinho = new Vinho();
	
		
		int OPC,loop=0;
		
		Object[] options = { "Cadastrar vinho","Verificar preço","Mostrar vinho","Sair" };
		
		while(loop == 0) {
			OPC = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",0, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
			if(OPC == 0) {
				vinho.nome = JOptionPane.showInputDialog("Qual o nome do vinho?");
				vinho.tipo = JOptionPane.showInputDialog("Qual o tipo do vinho?");
				vinho.safraa = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a safra do vinho?","Digite", JOptionPane.ERROR_MESSAGE));
				vinho.precoo =  Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o valor do vinho?","Digite", JOptionPane.ERROR_MESSAGE));
			}
			if (OPC == 1) {
				vinho.verificaPreco(vinho.precoo);	
				if (vinho.confirmar == true) {
					JOptionPane.showMessageDialog(null, "Promoção", "Promoção", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Normal", "Normal", JOptionPane.ERROR_MESSAGE);
				}
			}
			if (OPC == 2) {
				vinho.mostrarVinho();
				JOptionPane.showMessageDialog(null, vinho.dados, "Normal", JOptionPane.ERROR_MESSAGE);
			}
			if(OPC == 3) {
				break;
			}
		}
		
		//OPC 0 = cadastrar vinho
		//OPC 1 = cadastrar vinho
		//OPC 2 = cadastrar vinho
		//OPC 3 = cadastrar vinho
	}

}
