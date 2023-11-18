package loja;

public class Vendedores extends Funcionario {
	private double vendas, salarioFinal;

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getSalarioFinal() {
		return salarioFinal = getSalarioBase() + (this.vendas * 0.95);
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
}//public class Vendedores extends Funcionario
