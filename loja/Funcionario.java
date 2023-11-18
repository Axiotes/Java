package loja;

public class Funcionario {
	private String nome;
	private int rg;
	private double salarioBase;
	
	// GET		
	public String getNome() {
		return nome;
	}
	
	public int getRg() {
		return rg;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	// SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}//public class Funcionario