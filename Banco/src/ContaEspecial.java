
public class ContaEspecial extends ContaCorrente {
	
	// Limite de quanto eu posso "ir" negativo
	
	int limite;
	
	ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	public int sacar(int valor) {
		if (valor > (saldo + limite)) {
			return 0;
		}
		else {
			saldo -= valor;
			return valor;
		}
	}	
}
