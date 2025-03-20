package sorteio;

import java.util.Iterator;
import java.util.Scanner;

public class jogoAdivinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double aleatorio=Math.random();
		boolean acertou = false;
		int palpite =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um numero para ser o maximo");
		int max = sc.nextInt();
		System.out.printf("Digite um numero para ser o limite de tentativas");
		int limite = sc.nextInt();
		aleatorio=aleatorio*max;
		int meta = (int)aleatorio;
			do {
			System.out.printf("Digite um palpite de um número entre 0 a %d: (Digite 1 para FECHAR o programa\n)",max);
			palpite = sc.nextInt();
			if (palpite == meta) {
				System.out.println("Parabéns, você acertou o número sorteado");
				System.out.println("O número inteiro é:" +meta);
				acertou = true;
			}else {
				System.out.println("Infelizmente, você errou o número,digite outro número e tente novamente\n");
				if (palpite < meta) {
					System.out.printf("O numero sorteado é maior\n");		
				}else{
					System.out.printf("O numero sorteado é menor\n");
				}
			limite --;
			System.out.printf("Restam %d Tentativas\n",limite);
			}
			}while (acertou == false && palpite != 1 && limite != 0 );
			if (acertou == true) {
				System.out.println("VOCÊ ACERTOU");
			}else if(palpite == 1) {
				System.out.println("SAIU DO PROGRAMA");
			}else {
				System.out.println("ZEROU AS TENTATIVAS");
			}
			
			;
		
		}
		
		
	}
 