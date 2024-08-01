package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o um Numero: ");
		n1 = sc.nextInt();

		if (n1 % 4 == 0 & n1 % 5 ==-0) {
			System.out.println("Esse numero é divisivel por 5 e 4");
			
		}
		else {
			System.out.println("Este número não é divisivel por 4 e 5");
		}
		
	}

}
