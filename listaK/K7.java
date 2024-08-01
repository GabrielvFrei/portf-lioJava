//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K7 {

	public static void main(String[] args) {
		int vtsFujiro = 0;
        int vtsTakaro = 0;
        int totalV = 0;
        String candidato1 = "Fujiro NaKombi";
        String candidato2 = "TakaroNé";
        String resp;
        
        do {
            resp = JOptionPane.showInputDialog("Escolha o candidato:\n1 - " + candidato1 + "\n2 - " + candidato2 + "\n0 - Encerrar a votação");
            
            if (resp != null) {
                int voto = Integer.parseInt(resp);
                switch (voto) {
                    case 1:
                        vtsFujiro++;
                        totalV++;
                        break;
                    case 2:
                        vtsTakaro++;
                        totalV++;
                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha 1, 2 ou 0.");
                        break;
                }
            }
        } while (resp != null && !resp.equals("0"));

        String resultado;
        if (vtsFujiro > vtsTakaro) {
            resultado = candidato1 + " é o novo gerente da empresa!";
        } else if (vtsTakaro > vtsFujiro) {
            resultado = candidato2 + " é o novo gerente da empresa!";
        } else {
            
            resp = JOptionPane.showInputDialog("Empate! Por favor, vote novamente para desempatar:\n1 - " + candidato1 + "\n2 - " + candidato2);
            if (resp != null) {
                int votoDesempate = Integer.parseInt(resp);
                if (votoDesempate == 1) {
                    resultado = candidato1 + " é o novo gerente da empresa!";
                } else if (votoDesempate == 2) {
                    resultado = candidato2 + " é o novo gerente da empresa!";
                } else {
                    resultado = "Voto de desempate inválido. Empate continua.";
                }
            } else {
                resultado = "Voto de desempate não fornecido. Empate continua.";
            }
        }
        double percentualFujiro = (double) vtsFujiro / totalV * 100;
        double percentualTakaro = (double) vtsTakaro / totalV * 100;

        JOptionPane.showMessageDialog(null, resultado + "\nTotal de votos: " + totalV + "\nPercentual de votos de " + candidato1 + ": " + percentualFujiro + "%\nPercentual de votos de " + candidato2 + ": " + percentualTakaro + "%");
	}

}
