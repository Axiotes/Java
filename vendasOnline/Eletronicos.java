package vendasOnline;

public class Eletronicos extends Produtos {
	private int voltagem;
	
	// Método construtor
	public Eletronicos(String nome, double preco, int voltagem, int quantidadeEmEstoque) {
		setNome(nome);
		setPreco(preco);
		setVoltagem(voltagem);
		setQuantidadeEmEstoque(quantidadeEmEstoque);
	}
	
	@Override
	public double custoEnvio() {
		return 0.05 * getPreco();
	}

	// GET
	public int getVoltagem() {
		return voltagem;
	}

	// SET
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
}//public class Eletronicos extends Produtos