import java.util.Arrays;

public class Pilha {
	
	private Object[] elementos; // Array de objetos para guardar os elementos da pilha
	private int topo = 0; // Inteiro pra guardar o ponto da pilha, onde está o topo da pilha

	public Pilha(int maximo) { // Tamanho maximo da pilha
		elementos = new Object[maximo];
	}
	
	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}
	
	public Object topo() {
		return elementos[topo - 1];
	}
	
	public int tamanho() {
		return topo;
	}

	public Object[] getElementos() {
		Object[] paraRetorno = Arrays.copyOf(elementos, tamanho());
		return paraRetorno;
	}
	
	/*
	 * A pilha tem 3 operações básicas:
	 * Empilhar: colocar novo elemento na pilha
	 * Desempilhar: vai removendo
	 * Ver onde está o topo
	 */

}
