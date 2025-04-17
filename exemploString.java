package exemplo;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;

public class exemploString {

	public static void main(String[] args) throws IOException {
		/*String hello = " Alo mundo Java";
		String professora = " Professora Sirley";
		String aula = hello+"\n "+professora;
		System.out.println(aula);*/
			 /*int i;
			// o especificador de formato para caractere (%c)
			// mostra o i-ésimo caractere da tabela ASCII
			 System.out.printf("Caracteres numéricos:\n");
			 for (i=48; i<=57; i++) {
			 System.out.printf("%c", i);
			 }
			 System.out.printf("\n\nCaracteres alfabéticos maiúsculos:\n");
			 for (i=65; i<=90; i++) {
			 System.out.printf("%c", i);
			 }
			 System.out.printf("\n\nCaracteres alfabéticos minúsculos:\n");
			 for (i=97; i<=122; i++) {
			 System.out.printf("%c", i);
			 }
			 System.out.printf("\n");
			 }
			// através da claúsula throws indicamos que não iremos
			// tratar possíveis erros na entrada de dados realizada
			// através do método "read" do pacote de classes System.in
			 Scanner ler = new Scanner(System.in);
			 String nome;
			 int tamanho;
			 System.out.printf("Informe um nome:\n");
			 nome = ler.nextLine();
			 tamanho = nome.length();
			 System.out.printf("%d", tamanho);*/
			String frase;
			Scanner sc = new Scanner(System.in);
			
			System.out.printf("Digite uma frase");
			frase = sc.nextLine();
			int caracteres = frase.length();
			String fraseMai = frase.toUpperCase();
		    int vogais = 0;
		    int numeros = 0;
			for (int i = 0; i < caracteres; i++) {
				char carac = frase.charAt(i);
				if (String.valueOf(carac).matches("[a,e,i,o,u]")) {
				    vogais++;
				}
				if (String.valueOf(carac).matches("[1,2,3,4,5,6,7,8,9]")) {
				    numeros++;
				}
			}
			System.out.printf("A String possue %d caracteres \n", caracteres);
			System.out.printf("A String maiuscula: %s \n", fraseMai);
			System.out.printf("A String possue %d vogais \n", vogais);
			System.out.printf("A String possue %d numeros\n", numeros);
	}
}

