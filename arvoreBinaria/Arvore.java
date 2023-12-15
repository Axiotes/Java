package arvoreBinaria;

public class Arvore {
	private Elementos raiz;
	
	// MÉTODO CONSTRUTOR
	public Arvore() {
		this.raiz = null;
	}
	
	// Get e Set raiz
	public Elementos getRaiz() {
		return raiz;
	}

	public void setRaiz(Elementos raiz) {
		this.raiz = raiz;
	}
	// Fim Get e Set raiz

	// MÉTODOS
	public void adicionar(int valor) { // Adicionar valor
		Elementos novoElemento = new Elementos(valor);
		
		if (raiz == null) { // Verificar se a árvore já possui uma raiz
			// Árvore sem raiz / Novo elemento se torna raiz
			this.raiz = novoElemento;
		} else {
			// Definir raiz como elemento de referência
			Elementos atual = this.raiz;
			
			while (true) { // Loop para adicionar elemento de forma ordenada
				
				if (novoElemento.getValor() < atual.getValor()) { // Verificar se o novo elemento é maior ou menor que o elemento de referência
					// Elemento menor / Esquerda do elemento de referência
					
					if (atual.getEsquerda() != null) { // Verificar se o elemento de referência já tem um elemento a esquerda
						// Já tem elemento a esquerda
						atual = atual.getEsquerda(); // Nó filho a esquerda se torna o elemento de referência
					} else { // Não possui elemento a esquerda 
						// Adicionar elemento a esquerda do elemento de referência
						atual.setEsquerda(novoElemento);
						break;
					} // Fim else Não possui elemento a esquerda
					
				} else { // Elemento maior que o elemento de referência
					// Direita do elemento de referência
					
					if (atual.getDireita() != null) { // Verificar se o elemento de referência já tem um elemento a direita
						// Já tem elemento a direita
						atual = atual.getDireita(); // Nó filho se torna raiz
					} else { // Não tem elemento a direita 
						// Adicionar elemento a direita da raiz atual
						atual.setDireita(novoElemento);
						break;
					} // Fim else Não tem elemento a direita
					
				} // Fim else Elemento maior que o elemento de referência
				
			}//while (true)
		}
	}//public void adicionar(int valor)
	
	public void listarArvore(Elementos atual) { // Listar a árvore
		if (atual != null) { // Verificar se tem elementos na árvore
			listarArvore(atual.getEsquerda());
			System.out.println(atual.getValor());
			listarArvore(atual.getDireita());
		}
	}//public void ListarArvore()
	
	public void pesquisarNo(int valor) { // Pesquisar elemento na árvore
		Elementos atual = this.raiz;
		
		while (atual != null) { // Loop para verificar se o valor está na árvore
			if (atual.getValor() == valor) { // Verificar se o valor digitado é igual ao elemento de referência
				// Valor igual
				break;
			} if (valor < atual.getValor()) { 
				// Valor menor
				atual = atual.getEsquerda(); // O nó filho a esquerda se torna o elemento de referência
			} else {
				// Valor maior
				atual = atual.getDireita(); // O nó filho a direita se torna o elemento de referência
			}
		}//while (true) 
		
		if (atual != null) { // Valor encontrado na árvore
			System.out.println("Valor " + valor + " está na árvore");
		} else { // Valor não encontrado na árvore
			System.out.println("Valor " + valor + " não está na árvore");
		}//if (atual != null)
	}//public boolean pesquisarNo(int valor)
	
	public boolean excluir(int valor) {
		Elementos atual = this.raiz;
		Elementos paiAtual = null;
		
		while (atual != null) {
			if (atual.getValor() == valor) {
				break;
			} if (valor < atual.getValor()) {
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}//while (atual != null)
		
		if (atual != null) {
			if (atual.getDireita() != null) { // Elemento de referência possui apenas o nó filho da direita
				Elementos substituto = atual.getDireita();
				Elementos paiSubstituto = atual;
				
				while (substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}//while (substituto.getEsquerda() != null)
				
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else {
					this.raiz = substituto;
				}
				
				if (substituto.getValor() < paiSubstituto.getValor()) {
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
				
			} if (atual.getEsquerda() != null) { // Elemento de referência possui apenas o nó filho da esquerda
				Elementos substituto = atual.getEsquerda();
				Elementos paiSubstituto = atual;
				
				while (substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}//while (substituto.getDireita() != null)
				
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else {
					this.raiz = substituto;
				}
				
				if (substituto.getValor() < paiSubstituto.getValor()) {
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
				
			} else { // Elemento de referência não possui filho
				
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else {
					this.raiz = null;
				}
			}
			
			return true;
		} else {
			return false;
		}
	}//public boolean excluir(int valor)
}//public class Arvore
