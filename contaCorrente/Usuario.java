package contaCorrente;

public class Usuario {
	private String nome, senha;
	private long cpf;
	
	// GET
	public String getNome() {
		return nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	// SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
}//public class Usuario
