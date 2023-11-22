package vendasOnline;

public class Roupa extends Produtos {
	private String tamanho, cor;
	
	// Método construtor
	public Roupa(String nome, double preco, int quantidadeEmEstoque) {
		setNome(nome);
		setPreco(preco);
		setQuantidadeEmEstoque(quantidadeEmEstoque);
	}
	
	@Override
	public double custoEnvio() {
		return 0.10 * getPreco();
	}
	
	// GET
	public String getTamanho() {
		return tamanho;
	}

	public String getCor() {
		return cor;
	}
	
	// SET
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}//public class Roupa extends Produtos