package loja;

public class Administrativo extends Funcionario {
	private double horaExtra, salarioFinal;

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double getSalarioFinal() {
		return salarioFinal = getSalarioBase() + (this.horaExtra * 0.01);
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
}//public class Administrativo extends Funcionario
