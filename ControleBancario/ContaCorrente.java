//GABRIEL ALVES DE FREITAS
package ControleBancario;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
	private double limiteEspecial;
	
	
	
	
	public ContaCorrente(double saldo,double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}

	//getters and setters
	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public void sacar(double valor){
		try {
			if(valor<0) {
				throw new noValue();
			}
			else if(getSaldo()-valor < getLimiteEspecial()*-1) {
				throw new noSaldo();
			}else {
				setSaldo(getSaldo()-valor);
			}
		}catch(noSaldo e) {
			JOptionPane.showMessageDialog(null,"Sem Saldo Negativo" ,"NoValueError",JOptionPane.ERROR_MESSAGE);
		}catch(noValue e){
			JOptionPane.showMessageDialog(null,"Sem Valor" ,"NoValueError",JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Seu saldo restante é de: " +getSaldo() ,"NoValueError",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String toString(){
		
		
		return"Saldo: "+getSaldo()+".\n Limite Especial: "+getLimiteEspecial();
	}
}
