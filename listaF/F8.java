package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro Numero: ");
		a = sc.nextInt();
		
		System.out.println("Digite o segundo Numero: ");
		b = sc.nextInt();
		
		System.out.println("Digite o terceiro Numero: ");
		c = sc.nextInt();
		
		if (a>b) {
			if (b<c) {
				if(a>c) {
					System.out.println("a sequencia fica:" +b+","+c+","+a);
				}else {
					System.out.println("a sequencia fica:" +b+","+a+","+c);
				}
			}
			if (b>c) {
				System.out.println("a sequencia fica:" +c+","+b+","+a);
			}
		}
		if (a<b) {
			if (b<c) {
				System.out.println("a sequencia fica:" +a+","+b+","+c);
				}
			}
			if (b>c) {
				if(a>c) {
					System.out.println("a sequencia fica:" +c+","+a+","+b);
				}else {
					System.out.println("a sequencia fica:" +a+","+c+","+b);
				}
			}
			
		}

}
