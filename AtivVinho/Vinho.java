package AtivVinho;


public class Vinho {
	String nome;
	String tipo;
	String dados;
	Boolean confirmar;
	int safraa = 0;  
	double precoo = 0;
	
	
	
	
	void mostrarVinho(){
		dados = "O nome do vinho é: "+nome+" O tipo do vinho é: "+tipo+" O preço do vinho é: "+precoo+" A safra do vinho é: "+safraa;
	}
	void verificaPreco(Double preco){
		if (preco < 25) {
			confirmar = true;
		}else {
			confirmar = false;
		}
	}
}
