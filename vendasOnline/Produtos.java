package vendasOnline;

public class Produtos {
	private String nome;
	private double preco, valorFinal;
	private int quantidadeEmEstoque;
	
	// GET
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public double getValorFinal() {
		return valorFinal;
	}
	
	// SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	// Método Custo de envio
	public double custoEnvio() {
		return 0.10 * this.custoEnvio();
	}
}//public class Produtos