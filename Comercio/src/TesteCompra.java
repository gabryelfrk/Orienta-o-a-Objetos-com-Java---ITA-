import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas()); // Verifica se o n� de parcelas � 1
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
	}
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumeroParcelas()); // Verifica se o n� de parcelas � 1
		assertEquals(1000, c.getValorTotal());
		assertEquals(250, c.getValorParcela());
	}

}
