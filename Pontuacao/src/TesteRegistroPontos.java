import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	void pontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabryel";
		CalculadoraBonus calculadorBonus = new CalculadoraBonus();
		RegistroPontos registroPontos = new RegistroPontos(calculadorBonus);
		registroPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 5);
	}
	
	@Test
	void pontosCriarTopicoVIP() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabryel";
		usuario.vip = true;
		CalculadoraBonus calculadorBonus = new CalculadoraBonus();
		RegistroPontos registroPontos = new RegistroPontos(calculadorBonus);
		registroPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 25);
	}
	
	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabryel";
		CalculadoraBonus calculadorBonus = new CalculadoraBonus();
		calculadorBonus.bonusDoDia = 3;
		RegistroPontos registroPontos = new RegistroPontos(calculadorBonus);
		registroPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 15);
	}	
	
	@Test
	void pontosCriarTopicoVIPBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.nome = "Gabryel";
		usuario.vip = true;
		CalculadoraBonus calculadorBonus = new CalculadoraBonus();
		calculadorBonus.bonusDoDia = 2;
		RegistroPontos registroPontos = new RegistroPontos(calculadorBonus);
		registroPontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 50);
	}		

}
