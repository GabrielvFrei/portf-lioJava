//GABRIEL ALVES DE FREITAS
package ControleBancario;

import javax.swing.JOptionPane;

public class MenuConta extends Menu{
	
	ContaCorrente contaCC = new ContaCorrente(500, 1000);
	ContaPoupanca contaCP = new ContaPoupanca(5000, 0.01);

	protected void executarMenu(){
		String[] opcoes= {"SAIR","CONTA CORRENTE","CONTA POUPANCA"};
		
		try {
			
			setOpcao(JOptionPane.showOptionDialog(null, "ESCOLHA UMA CONTA","CONTA",0,JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]));
			//super.executarMenu();
			
		}finally {
			avaliarOpcaoEscolhida();
		}
	}
	protected void avaliarOpcaoEscolhida(){
		
		if(getOpcao() == 1) {
			operarContaCC();
		}else if(getOpcao() == 2) {
			operarContaCP();
		}else if(getOpcao()==0){
			setOpcao(-1);
			
		}else {
		
			JOptionPane.showMessageDialog(null, "Opção Invalida","ERRO",JOptionPane.ERROR_MESSAGE);;
		}
		
		
	}
	
	private void operarContaCC() {
		do{
			
			super.executarMenu();
			if(getOpcao()==1) {
				JOptionPane.showMessageDialog(null, contaCC.toString());
			}else if(getOpcao()==2) {
				try {
					
					contaCC.depositar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor do deposito!","DEPOSITO",JOptionPane.QUESTION_MESSAGE)));
					
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite Apenas Numeros","ERROR",JOptionPane.ERROR_MESSAGE);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Saiu","SAIR",JOptionPane.ERROR_MESSAGE);
				}
				
			}else if(getOpcao()==3) {
				try {
					
					contaCC.sacar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor do saque!","SAQUE",JOptionPane.QUESTION_MESSAGE)));
					
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros!","ERROR",JOptionPane.ERROR_MESSAGE);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Saiu","SAIR",JOptionPane.INFORMATION_MESSAGE);

				}
				
			}else if(getOpcao()==4) {
				
				contaCC.atualizarSaldo();
				
			}else if(getOpcao()==0) {
				executarMenu();
				setOpcao(-1);
				break;
			}else {
				executarMenu();
				setOpcao(-1);
				break;
			}
		}while(getOpcao()!=0);
	}
	private void operarContaCP() {
		do {
			super.executarMenu();
			if(getOpcao()==1) {
				JOptionPane.showMessageDialog(null, contaCP.toString());
			}else if(getOpcao()==2) {
				try {
					
					contaCP.depositar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor do deposito!","DEPOSITO",JOptionPane.QUESTION_MESSAGE)));
					
				}catch(NumberFormatException e) {
				
					JOptionPane.showMessageDialog(null, "Digite apenas numeros!","ERROR",JOptionPane.ERROR_MESSAGE);
				
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Saiu" ,"SAIR",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if(getOpcao()==3) {
				try {
					
					contaCP.sacar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor do saque!","SAQUE",JOptionPane.QUESTION_MESSAGE)));
					
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros!","ERROR",JOptionPane.ERROR_MESSAGE);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Saiu" ,"Reajuste",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if(getOpcao()==4) {
				try {
					contaCP.atualizarSaldo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor do reajuste!","REAJUSTE",JOptionPane.QUESTION_MESSAGE)));
					
					
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros!","ERROR",JOptionPane.ERROR_MESSAGE);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Saiu" ,"Reajuste",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}else if(getOpcao()==0) {
				executarMenu();
				setOpcao(-1);
				break;
			}else {
				
				executarMenu();
				setOpcao(-1);
				break;
			}
		}while(getOpcao()!=0);
	}
}
