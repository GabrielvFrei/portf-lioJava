import javax.swing.JOptionPane;

public class churrasco {

    public static void main(String[] args) {
        int carneBovinaDisponivel = 4;
        int tulipaDisponivel = 2;
        int linguiçaFrangoDisponivel = 2;
        int farofaDisponivel = 1;
        int refrigeranteDisponivel = 5;

        String[] participantes = {"Participante 1", "Participante 2", "Participante 3", "Participante 4", "Participante 5", "Participante 6", "Participante 7"};

        for (String participante : participantes) {
            escolherItens(participante, carneBovinaDisponivel, tulipaDisponivel, linguiçaFrangoDisponivel, farofaDisponivel, refrigeranteDisponivel);
        }

        exibirItens(participantes);
    }

    private static void escolherItens(String participante, int carneBovina, int tulipa, int linguiçaFrango, int farofa, int refrigerante) {
        while (true) {
            String escolha1Str = JOptionPane.showInputDialog(participante + ", escolha o primeiro item:\n" +
                    "1. Carne bovina (500g cada) - Disponível: " + carneBovina + "\n" +
                    "2. Tulipa (500g cada) - Disponível: " + tulipa + "\n" +
                    "3. Linguiça de frango (500g cada) - Disponível: " + linguiçaFrango + "\n" +
                    "4. Farofa (1kg) - Disponível: " + farofa + "\n" +
                    "5. Refrigerante (1l cada) - Disponível: " + refrigerante);

            String escolha2Str = JOptionPane.showInputDialog("Escolha o segundo item:\n" +
                    "1. Carne bovina (500g cada) - Disponível: " + carneBovina + "\n" +
                    "2. Tulipa (500g cada) - Disponível: " + tulipa + "\n" +
                    "3. Linguiça de frango (500g cada) - Disponível: " + linguiçaFrango + "\n" +
                    "4. Farofa (1kg) - Disponível: " + farofa + "\n" +
                    "5. Refrigerante (1l cada) - Disponível: " + refrigerante);

            int escolha1 = Integer.parseInt(escolha1Str);
            int escolha2 = Integer.parseInt(escolha2Str);

            if (validarEscolha(escolha1, escolha2)) {
                debitarItens(escolha1, escolha2, carneBovina, tulipa, linguiçaFrango, farofa, refrigerante);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente.");
            }
        }
    }

    private static boolean validarEscolha(int escolha1, int escolha2) {
        return escolha1 >= 1 && escolha1 <= 5 && escolha2 >= 1 && escolha2 <= 5 && escolha1 != escolha2;
    }

    private static void debitarItens(int escolha1, int escolha2, int carneBovina, int tulipa, int linguiçaFrango, int farofa, int refrigerante) {
        switch (escolha1) {
            case 1:
                carneBovina -= 2;
                break;
            case 2:
                tulipa -= 2;
                break;
            case 3:
                linguiçaFrango -= 2;
                break;
            case 4:
                farofa -= 1;
                break;
            case 5:
                refrigerante -= 2;
                break;
        }

        switch (escolha2) {
            case 1:
                carneBovina -= 2;
                break;
            case 2:
                tulipa -= 2;
                break;
            case 3:
                linguiçaFrango -= 2;
                break;
            case 4:
                farofa -= 1;
                break;
            case 5:
                refrigerante -= 2;
                break;
        }
    }

    private static void exibirItens(String[] participantes) {
        StringBuilder resultado = new StringBuilder("\nItens que cada participante levará para o churrasco:\n");

        for (String participante : participantes) {
            resultado.append(participante).append(": ").append("Carne bovina: 500g x 2, Tulipa: 500g x 2, Linguiça de frango: 500g x 2, Farofa: 1kg x 1, Refrigerante: 1l x 2\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
