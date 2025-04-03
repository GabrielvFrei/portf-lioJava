package provap1;

import java.util.Scanner;

public class prova1 {

	public static void main(String[] args) {
		/*int a,b, x;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		x = a + b;
		System.out.printf("X = %d\n",x);
		*/
		
		/*int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		System.out.printf("%d minutos",(x*2));
		*/
		/*int cod, quantidade;
		double preco = 0;
		Scanner sc = new Scanner(System.in);
		
		cod = sc.nextInt();
		quantidade = sc.nextInt();
		if (cod == 1){
			preco = 4.00;
		}if(cod == 2) {
			preco = 4.50;
		}if(cod == 3) {
			preco = 5.00;
		}if(cod == 4) {
			preco = 2.00;
		}if(cod == 5) {
			preco = 1.50;
		}
		preco = preco * quantidade;
		System.out.printf("Total: R$ %.2f\n",preco);
		*/
		/*int x, y;
		Scanner sc = new Scanner(System.in);
		do {
		x = sc.nextInt();
		y = sc.nextInt();
		if (x > 0 & y > 0) {
			System.out.printf("primeiro\n");
		}if(x > 0 & y < 0) {
			System.out.printf("quarto\n");
		}if(x < 0 & y < 0) {
			System.out.printf("terceiro\n");
		}if (x < 0 & y > 0) {
			System.out.printf("segundo\n");
		};
		}while(x != 0 & y != 0);
		*/
		/*double a, b, c, media;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		a = a*0.2;
		b = b*0.3;
		c = c*0.5;
		
		media = a+b+c;
		
		System.out.printf("MEDIA = %.1f\n", media);
		*/
		double n1, n2, media;
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			do{
				n1 = sc.nextDouble();
				if (n1 < 0 || n1 > 10) {
					System.out.printf("nota invalida\n");
				}
			}while(n1 < 0 || n1 > 10);
			do {
				n2 = sc.nextDouble();
				if (n2 < 0 || n2 > 10) {
					System.out.printf("nota invalida\n");
				}
			}while(n2 < 0 || n2 > 10);
			
			media = (n1+n2)/2;
			System.out.printf("media = %.2f\n", media);
			do {
				System.out.printf("novo calculo (1-sim 2-nao)\n");
				x = sc.nextInt();
				}while(x > 2 || x < 1);
		}while(x != 2);
}
}