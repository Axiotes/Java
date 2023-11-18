package Pagamento;

public class Contas {
	private double valor, pix, creditoVista, creditoParcela3;

	//GET
	public double getValor() {
		return valor;
	}

	public double getPix() {
		return pix;
	}

	public double getCreditoVista() {
		return creditoVista;
	}

	public double getCreditoParcela3() {
		return creditoParcela3;
	}

	//SET
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setPix(double pix) {
		this.pix = pix;
		
		this.pix = this.valor - (0.15 * this.valor);
	}
	
	public void setCreditoVista(double creditoVista) {
		this.creditoVista = creditoVista;
		
		this.creditoVista = this.valor - (0.10 * this.valor);
	}
	
	public void setCreditoParcela3(double creditoParcela3) {
		this.creditoParcela3 = creditoParcela3;
		
		this.creditoParcela3 = this.valor + (0.10 * this.valor);
	}
}//public class Contas
