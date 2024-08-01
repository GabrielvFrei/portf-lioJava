//Gabriel Alves de Freitas
package listaK;

import javax.swing.JOptionPane;

public class K9 {

	public static void main(String[] args) {
		int vtsFerrari = 0;
        int vtsPorsche = 0;
        int vtsMercedes = 0;
        int tlVotos = 0;

        String resp;
        
        do {
            resp = JOptionPane.showInputDialog("Qual carro você prefere?\n1 - Ferrari\n2 - Porsche\n3 - Mercedes\n0 - Encerrar");
            
            if (resp != null) {
                int voto = Integer.parseInt(resp);
                switch (voto) {
                    case 1:
                        vtsFerrari++;
                        tlVotos++;
                        break;
                    case 2:
                        vtsPorsche++;
                        tlVotos++;
                        break;
                    case 3:
                        vtsMercedes++;
                        tlVotos++;
                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Por favor, escolha 1, 2, 3 ou 0.");
                }
            }
        } while (!resp.equals("0")); 

        double percFerrari = (double) vtsFerrari / tlVotos * 100;
        double percPorsche = (double) vtsPorsche / tlVotos * 100;
        double percMercedes = (double) vtsMercedes / tlVotos * 100;

        JOptionPane.showMessageDialog(null,
                "Resultado da pesquisa:\n" +
                "1 - Ferrari: " + vtsFerrari + " votos, " + percFerrari + "% dos votos\n" +
                "2 - Porsche: " + vtsPorsche + " votos, " + percPorsche + "% dos votos\n" +
                "3 - Mercedes: " + vtsMercedes + " votos, " + percMercedes + "% dos votos\n" +
                "Total de votos: " + tlVotos);

        if (vtsFerrari == vtsPorsche && vtsFerrari == vtsMercedes) {
            JOptionPane.showMessageDialog(null, "Houve um empate entre todos os carros!");
        } else if (vtsFerrari == vtsPorsche) {
            JOptionPane.showMessageDialog(null, "Houve um empate entre Ferrari e Porsche!");
        } else if (vtsFerrari == vtsMercedes) {
            JOptionPane.showMessageDialog(null, "Houve um empate entre Ferrari e Mercedes!");
        } else if (vtsPorsche == vtsMercedes) {
            JOptionPane.showMessageDialog(null, "Houve um empate entre Porsche e Mercedes!");
        } else {
        }
	}

}
