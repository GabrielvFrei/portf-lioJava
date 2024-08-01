//GABRIEL ALVES DE FREITAS
package ControleBancario;

import javax.swing.JOptionPane;

public class Conta {
	private double saldo;
	
	
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	//getters and setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor){
		
		try {
			if(valor <= 0) {
				throw new noValue();
			}else {
				setSaldo(getSaldo()+valor);
				JOptionPane.showMessageDialog(null,"Seu saldo atual é de: " +getSaldo() ,"SALDO",JOptionPane.INFORMATION_MESSAGE);
			}
		
		}catch(noValue e){
			JOptionPane.showMessageDialog(null,"Sem Valor digitado" ,"NoValueError",JOptionPane.INFORMATION_MESSAGE);
			
		}
	
				
	}
	
	public void sacar(double valor){

		try {
			if(valor <=0) {
				throw new noValue();	
			}
			else if(getSaldo() < valor) {
				throw new noSaldo();
			}else {
			setSaldo(getSaldo()-valor);
			JOptionPane.showMessageDialog(null,"Sacado" ,"SAQUE",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Seu saldo atual é de: " +getSaldo() ,"Saldo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}catch(noValue e) {
			JOptionPane.showMessageDialog(null,"Sem Valor" ,"NoValueError",JOptionPane.ERROR_MESSAGE);
		}catch(noSaldo e){
			JOptionPane.showMessageDialog(null,"Sem Saldo" ,"NoValueError",JOptionPane.ERROR_MESSAGE);
				
		}
			
		
		
	} 
	
	
	public void atualizarSaldo(){
		if(getSaldo()<0) {
			setSaldo(getSaldo()-getSaldo()*0.08);
			JOptionPane.showMessageDialog(null,"Negativado" ,"Negativado",JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null,"Saldo Atualizado" ,"Atualização",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Seu saldo atual é de: " +getSaldo() ,"Saldo",JOptionPane.INFORMATION_MESSAGE);
	}	
	
	
}

