package arvoreBinaria;

public class Elementos {
	private int valor;
	private Elementos esquerda;
	private Elementos direita;
	
	public Elementos(int novoValor) {
		this.valor = novoValor;
		this.esquerda = null;
		this.direita = null;
	}
	
	// GETTERS E SETTERS
	// Get e Set Valor
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	// Fim Get Set Valor

	// Get e Set Esquerda
	public Elementos getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elementos esquerda) {
		this.esquerda = esquerda;
	}
	// Fim Get Set Esquerda

	// Get e Set Direita
	public Elementos getDireita() {
		return direita;
	}

	public void setDireita(Elementos direita) {
		this.direita = direita;
	}
	// Fim Get e Set Direita
	// Fim GETTERS E SETTERS
}//public class Elementos
