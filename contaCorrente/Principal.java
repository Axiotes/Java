package contaCorrente;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conta c = new Conta();
		Usuario u = new Usuario();
		
		int op = 0;
		
		while (op != 3) {
			System.out.println("Digite 1: ACESSAR CONTA CORRENTE\n"
							+ "Digite 2: CADASTRAR\n"
							+ "Digite 3: SAIR");
			op = scan.nextInt();
			
			switch (op) {
			case 1: // ACESSAR CONTA CORRENTE
				while (true) {
					System.out.println("Digite seu CPF:");
					c.setCpfUser(scan.nextLong());
					
					System.out.println("Digite sua senha:");
					c.setSenhaUser(scan.next());
					
					if (c.getCpfUser() == u.getCpf() && c.getSenhaUser().equals(u.getSenha())) {
						break;
					} else {
						System.out.println("CPF ou senha inválida!");
					}// Fim if conferir cpf e senha
				}//while (true)
				
				int operacao = 0;
				
				while (operacao != 4) {
					System.out.println("Digite 1: VER SALDO\n"
									+ "Digite 2: DEPÓSITO\n"
									+ "Digite 3: SAQUE\n"
									+ "Digite 4: SAIR");
					operacao = scan.nextInt();
					
					switch (operacao) {
					case 1: // VER SALDO
						System.out.println("Saldo: " + c.getSaldo());
						
						break;
					// Fim case 1
					
					case 2: // DEPÓSITO
						System.out.println("Valor do depósito:");
						c.setDeposito(scan.nextFloat());
						
						System.out.println("Valor depositado: " + c.getDeposito()
										+ "\nSaldo: " + c.getSaldo());
						
						break;
					// Fim case 2
						
					case 3: // SAQUE
						System.out.println("Valor do saque:");
						c.setSaque(scan.nextFloat());
						
						if (c.getSaque() <= c.getSaldo()) {
							
							System.out.println("Valor sacado: " + c.getSaque()
											+ "\nSaldo: " + c.getSaldo());
						} else {
							c.setSaldo(c.getSaque() + c.getSaldo());
							System.out.println("Saldo insuficiente"
											+ "\nValor da tentativa de saque: " + c.getSaque()
											+ "\nSaldo: " + c.getSaldo());
						}// Fim if verificar tentativa
						
						break;
					// Fim case 3
						
					case 4:
						System.out.println("");
						
						break;
					// Fim case 4
						
					default: // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida");
					}//switch (operacao)
				}//while (operacao != 4)
				
				break;
			// Fim case 1
			
			case 2: // CADASTRAR
				System.out.println("Digite seu nome:");
				u.setNome(scan.next());
				
				System.out.println("Digite seu CPF:");
				u.setCpf(scan.nextLong());
				
				System.out.println("Crie uma senha:");
				u.setSenha(scan.next());
				
				System.out.println("Cadastro finalizado!");
				
				break;
			// Fim case 2
				
			case 3: // FINALIZAR PROGRAMA
				System.out.println("Programa finalizado!");
				break;
			// Fim case 3
			
			default: // OPÇÃO INVÁLIDA
				System.out.println("Opção inválida");
			}//switch (op)
		}//while (op != 3)
	}//public static void main(String[] args)
}//public class Principal