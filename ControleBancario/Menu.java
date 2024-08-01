//GABRIEL ALVES DE FREITAS
package ControleBancario;

import javax.swing.JOptionPane;

public class Menu {
	
	private int opcao;
	private String mensagemMenu;
	
	//getters and setters
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public String getMensagemMenu() {
		return mensagemMenu;
	}
	public void setMensagemMenu(String mensagemMenu) {
		this.mensagemMenu = mensagemMenu;
	}
	
	public void executar() {
		executarMenu();
	}
	protected void executarMenu() {
		String[] opcoes= {"VOLTAR","CONSULTAR SALDO","DEPOSITAR","SACAR","ATUALIZAR SALDO"};
		
		setOpcao(JOptionPane.showOptionDialog(null, "SELECIONE UMA OPÇÃO","CONTA",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]));
			
		
		
		
	}
	protected void avaliarOpcaoEscolhida() {
		
		
	}
	
	
}
