package listamatriz;

import java.util.Scanner; 

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] M = new int[5][5];
		int[] SL = new int[5];
		int[] SC = new int[5];
		int linha = 0, coluna = 0, soma;
		String numeros = " ";
		
		for (linha = 0; linha < SL.length; linha++) {
			for (coluna = 0; coluna < SC.length; coluna++) {
				System.out.println(M[linha][coluna]);
				M[coluna][linha] = sc.nextInt();
				M [linha][coluna]=(SL+SC);
			}
		}
		System.out.println(numeros);
	}
}
