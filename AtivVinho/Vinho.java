package AtivVinho;


public class Vinho {
	String nome;
	String tipo;
	String dados;
	Boolean confirmar;
	int safraa = 0;  
	double precoo = 0;
	
	
	
	
	void mostrarVinho(){
		dados = "O nome do vinho �: "+nome+" O tipo do vinho �: "+tipo+" O pre�o do vinho �: "+precoo+" A safra do vinho �: "+safraa;
	}
	void verificaPreco(Double preco){
		if (preco < 25) {
			confirmar = true;
		}else {
			confirmar = false;
		}
	}
}
