package listaF;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		float x, y, z, so;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do 1� lado: ");
		x = sc.nextFloat();
		System.out.println("Digite o tamanho do 2� lado: ");
		y = sc.nextFloat();
		System.out.println("Digite o tamanho do 3� lado: ");
		z = sc.nextFloat();
		
		so = (x+y);
		
		if (x==y&&y!=z||z==x&&x!=y||y==z&&x!=z) {
			System.out.println("Isso n�o � um triangulo")  ;
			System.exit(0);
		}
		else {
		
			if ( x == y & y == z ) {
				System.out.println("Isso � um triangulo equilatero!");
			}
			else { 
				if (x==y&&y!=z||z==x&&x!=y||y==z&&x!=z) { 
					System.out.println("Isso � um triangulo isoceles!");
				}
				if (x != y & y!= z & z!=x) {
					System.out.println("Isso � um triangulo escaleno!");
				}
			}	
		}
	}
}
