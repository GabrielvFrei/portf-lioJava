//Gabriel Alves de Freitas
package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int votosMatrix = 0;
        int votosSenhorDosAneis = 0;
        do {
        	int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sua Idade?", "PESQUISA", JOptionPane.QUESTION_MESSAGE));
        	
        	
            System.out.println("Escolha a melhor saga de filmes:");
            System.out.println("1. Matrix");
            System.out.println("2. Senhor dos An�is");
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                votosMatrix++;
                System.out.println("Voc� votou em Matrix!");
            } else if (opcao == 2) {
                votosSenhorDosAneis++;
                System.out.println("Voc� votou em Senhor dos An�is!");
            } else {
                System.out.println("Op��o inv�lida. Por favor, escolha 1 para Matrix ou 2 para Senhor dos An�is.");
            }
            
            System.out.println("Deseja continuar a pesquisa? (S/N): ");
            String resposta = scanner.next();
            
            if (!resposta.equalsIgnoreCase("S")) {
                break; 
            }
		} while (true);
 
        
        System.out.println("Resultado da pesquisa:");
        System.out.println("Total de votos para Matrix: " + votosMatrix);
        System.out.println("Total de votos para Senhor dos An�is: " + votosSenhorDosAneis);
        
        if (votosMatrix > votosSenhorDosAneis) {
            System.out.println("A saga vencedora � Matrix!");
        } else if (votosSenhorDosAneis > votosMatrix) {
            System.out.println("A saga vencedora � Senhor dos An�is!");
        } else {
            System.out.println("Houve um empate entre Matrix e Senhor dos An�is!");
        }
	}

}
