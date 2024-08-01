import javax.swing.JOptionPane;

public class churrasco {

    public static void main(String[] args) {
        int carneBovinaDisponivel = 4;
        int tulipaDisponivel = 2;
        int lingui�aFrangoDisponivel = 2;
        int farofaDisponivel = 1;
        int refrigeranteDisponivel = 5;

        String[] participantes = {"Participante 1", "Participante 2", "Participante 3", "Participante 4", "Participante 5", "Participante 6", "Participante 7"};

        for (String participante : participantes) {
            escolherItens(participante, carneBovinaDisponivel, tulipaDisponivel, lingui�aFrangoDisponivel, farofaDisponivel, refrigeranteDisponivel);
        }

        exibirItens(participantes);
    }

    private static void escolherItens(String participante, int carneBovina, int tulipa, int lingui�aFrango, int farofa, int refrigerante) {
        while (true) {
            String escolha1Str = JOptionPane.showInputDialog(participante + ", escolha o primeiro item:\n" +
                    "1. Carne bovina (500g cada) - Dispon�vel: " + carneBovina + "\n" +
                    "2. Tulipa (500g cada) - Dispon�vel: " + tulipa + "\n" +
                    "3. Lingui�a de frango (500g cada) - Dispon�vel: " + lingui�aFrango + "\n" +
                    "4. Farofa (1kg) - Dispon�vel: " + farofa + "\n" +
                    "5. Refrigerante (1l cada) - Dispon�vel: " + refrigerante);

            String escolha2Str = JOptionPane.showInputDialog("Escolha o segundo item:\n" +
                    "1. Carne bovina (500g cada) - Dispon�vel: " + carneBovina + "\n" +
                    "2. Tulipa (500g cada) - Dispon�vel: " + tulipa + "\n" +
                    "3. Lingui�a de frango (500g cada) - Dispon�vel: " + lingui�aFrango + "\n" +
                    "4. Farofa (1kg) - Dispon�vel: " + farofa + "\n" +
                    "5. Refrigerante (1l cada) - Dispon�vel: " + refrigerante);

            int escolha1 = Integer.parseInt(escolha1Str);
            int escolha2 = Integer.parseInt(escolha2Str);

            if (validarEscolha(escolha1, escolha2)) {
                debitarItens(escolha1, escolha2, carneBovina, tulipa, lingui�aFrango, farofa, refrigerante);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Escolha inv�lida. Tente novamente.");
            }
        }
    }

    private static boolean validarEscolha(int escolha1, int escolha2) {
        return escolha1 >= 1 && escolha1 <= 5 && escolha2 >= 1 && escolha2 <= 5 && escolha1 != escolha2;
    }

    private static void debitarItens(int escolha1, int escolha2, int carneBovina, int tulipa, int lingui�aFrango, int farofa, int refrigerante) {
        switch (escolha1) {
            case 1:
                carneBovina -= 2;
                break;
            case 2:
                tulipa -= 2;
                break;
            case 3:
                lingui�aFrango -= 2;
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
                lingui�aFrango -= 2;
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
        StringBuilder resultado = new StringBuilder("\nItens que cada participante levar� para o churrasco:\n");

        for (String participante : participantes) {
            resultado.append(participante).append(": ").append("Carne bovina: 500g x 2, Tulipa: 500g x 2, Lingui�a de frango: 500g x 2, Farofa: 1kg x 1, Refrigerante: 1l x 2\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
