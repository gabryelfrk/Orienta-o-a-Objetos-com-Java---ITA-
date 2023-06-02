import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	// Durante as aulas, foi passado que o formato de assertEquals deveria ser:
	// Primeiro o valor esperado e depois o par�metro assertEquals(200, cc.saldo). 
	// Por�m aqui � mostrado o contr�rio: assertEquals(cc.saldo, 200).
	// Como � um comparativo, neste caso os dois formatos s�o v�lidos.
	
	ContaCorrente cc;
	
	@BeforeEach
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	void deposito() {
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	void saque() {
		int valorSacado = cc.sacar(50);
		assertEquals(cc.saldo, 150);
		assertEquals(valorSacado, 50);
	}	
	
	@Test
	void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}	

}
