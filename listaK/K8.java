//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K8 {

	public static void main(String[] args) {
		 int votosComputacao = 0;
	        int votosDireito = 0;
	        int votosLetras = 0;
	        int totalVotos = 0;
	        
	        String resp;
	        
	        do {
	            resp = JOptionPane.showInputDialog("Escolha o curso: \n1. Ciência da Computação\n2. Direito\n3. Letras");
	            
	            if (resp != null) {
	                int escolha = Integer.parseInt(resp);
	                
	                switch (escolha) {
	                    case 1:
	                        votosComputacao++;
	                        totalVotos++;
	                        break;
	                    case 2:
	                        votosDireito++;
	                        totalVotos++;
	                        break;
	                    case 3:
	                        votosLetras++;
	                        totalVotos++;
	                        break;
	                    default:
	                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
	                }   
	            }
	            
	        } while (resp != null);
	        
	        double percComputacao = (votosComputacao * 100.0) / totalVotos;
	        double percDireito = (votosDireito * 100.0) / totalVotos;
	        double percLetras = (votosLetras * 100.0) / totalVotos;
	        
	        String resultado = "Resultado da pesquisa:\n";
	        resultado += "Total de votos: " + totalVotos + "\n";
	        resultado += "Ciência da Computação: " + votosComputacao + " votos (" + percComputacao + "%)\n";
	        resultado += "Direito: " + votosDireito + " votos (" + percDireito + "%)\n";
	        resultado += "Letras: " + votosLetras + " votos (" + percLetras + "%)\n";
	        
	        JOptionPane.showMessageDialog(null, resultado);
	}

}
