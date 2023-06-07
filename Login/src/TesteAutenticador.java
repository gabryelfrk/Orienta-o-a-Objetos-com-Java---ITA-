import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("gabryel", "123");
		assertEquals("gabryel", u.getLogin());
	}
	
	@Test
	void loginFalho() throws LoginException {
		assertThrows(LoginException.class,
	            ()-> {
	        		  Autenticador a = new Autenticador();
	        		  Usuario u = a.logar("gabryel", "123456");
	            });
	}	
	
	@Test
	void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("gabryel", "12356");
			fail(); // Se não der a exceção é pra falhar
		} catch (LoginException e) {
			assertEquals("gabryel", e.getLogin());
		}
	}	

}
