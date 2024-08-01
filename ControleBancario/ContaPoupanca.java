//GABRIEL ALVES DE FREITAS
package ControleBancario;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{
	private double reajusteMensal;

	
	
	public ContaPoupanca(double valor, double reajusteMensal) {
		super(valor);
		this.reajusteMensal = reajusteMensal;
	}

	//getters and setters
	public double getReajusteMensal() {
		return reajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}
	
	public void atualizarSaldo(double reajuste){
		
		try {
			if(reajuste<=0) {
				throw new noValue();
			}else {
				setReajusteMensal(reajuste);
				setSaldo(getSaldo()+getSaldo()*getReajusteMensal());
			}
			
		}catch(noValue e){
			JOptionPane.showMessageDialog(null,"Sem Valor" ,"NoValueError",JOptionPane.ERROR_MESSAGE);
		}finally {
			JOptionPane.showMessageDialog(null,"Acabou" ,"Fim",JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public String toString(){
		
		return"Saldo: "+getSaldo()+".\n Reajuste Mensal: "+getReajusteMensal()*100+"%";
	}
}
