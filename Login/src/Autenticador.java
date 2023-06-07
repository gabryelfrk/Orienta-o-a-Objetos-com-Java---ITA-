
public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equals("gabryel") && senha.equals("123")) {
			return new Usuario(login);
		}
		throw new LoginException("Usuário e senha inválidos", login);
	}
}
