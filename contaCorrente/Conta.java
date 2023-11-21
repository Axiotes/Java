package contaCorrente;

public class Conta {
	private float saldo, saque, deposito;
	private String senhaUser;
	private long cpfUser;

	// GET
	public float getSaldo() {
		return saldo;
	}

	public float getSaque() {
		return saque;
	}

	public float getDeposito() {
		return deposito;
	}
	
	public String getSenhaUser() {
		return senhaUser;
	}
	
	public long getCpfUser() {
		return cpfUser;
	}
	
	// SET
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void setSaque(float saque) {
		this.saque = saque;
		
		this.saldo = getSaldo() - getSaque();
	}
	
	public void setDeposito(float deposito) {
		this.deposito = deposito;
		
		this.saldo = getSaldo() + getDeposito();
	}

	public void setCpfUser(long cpfUser) {
		this.cpfUser = cpfUser;
	}

	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}
}//public class Conta