//Gabriel Alves de Freitas
package listaK;

public class K9 {

	public static void main(String[] args) {

		float atual = 0, inicial = 0;
		
	
		do {
			float impopar = inicial%2;
			if (impopar == 1) {
				atual += inicial;
				
			}
			inicial++;
			
		} while (inicial < 20);
		
		System.out.println("A Soma de todos os numeros impares de 0 a 20 é " + atual);
		
		atual = 1;
		inicial = 1;
		do {
			inicial++;
			float impopar = inicial%2;
			if (impopar == 0) {
				atual *= inicial;
			}
		} while (inicial < 20);
		
		System.out.println("A Multiplicaçao de todos os numeros pares entre 0 e 20 é " + atual);
		
	}

}
