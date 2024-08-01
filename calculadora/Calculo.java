package calculadora;

public class Calculo {
	public float bla(float n1, int opc,float n2) {
	float resultado = 0;
	switch (opc) {
	case 0:
		resultado = n1 / n2;
		break;
	case 1:
		resultado = n1 - n2;
		break;
	case 2:
		resultado = n1 + n2;
		break;
	case 3:
		resultado = n1 * n2;
		break;
	}	
	return resultado;
	};
}
