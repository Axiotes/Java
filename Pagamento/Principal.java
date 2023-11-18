package Pagamento;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Contas c = new Contas();
		
		int op = 0;
		
		while (op != 2) {
			System.out.println("Digite 1: FAZER PAGAMENTO\n"
							+ "Digite 2: SAIR");
			op = scan.nextInt();
			
			if (op == 1) { // FAZER PAGAMENTO
				System.out.println("Valor do produto:");
				c.setValor(scan.nextDouble());
				
				int opPagamento = 0;
				
				System.out.println("Escolha a forma de pagamento\n"
								+ "Digite 1: PIX (15% de desconto)\n"
								+ "Digite 2: CARTÃO DE CRÉDITO À VISTA (10% de desconto)\n"
								+ "Digite 3: CARTÃO DE CRÉDITO PARCELADO EM 2 VEZES\n"
								+ "Digite 4: CARTÃO DE CRÉDITO PARCELADO EM 3 VEZES (10% de juros)");
				opPagamento = scan.nextInt();
				
				int opConfirmar = 0;
				
				if (opPagamento == 1) { // PIX
					c.setPix(c.getValor());
					
					System.out.println("Valor final: R$ " + c.getPix()
									+ "\nDigite 1: CONFIRMAR PAGAMENTO"
									+ "\nDigite 2: CANCELAR PAGAMENTO");
					opConfirmar = scan.nextInt(); 
					
					if (opPagamento == 1) { // CONFIRMAR PAGAMENTO
						System.out.println("Pagamento realizado!");
					} if (opPagamento == 2) {
						System.out.println("Pagamento cancelado!");
					} if (opPagamento < 1 || opPagamento > 2) { // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida!");
					}// Fim if opPagamento
					
				} if (opPagamento == 2) { // CRÉDITO À VISTA
					c.setCreditoVista(c.getValor());
					
					System.out.println("Valor final: R$ " + c.getCreditoVista()
									+ "\nDigite 1: CONFIRMAR PAGAMENTO"
									+ "\nDigite 2: CANCELAR PAGAMENTO");
					opConfirmar = scan.nextInt();
					
					if (opPagamento == 1) { // CONFIRMAR PAGAMENTO
						System.out.println("Pagamento realizado!");
					} if (opPagamento == 2) {
						System.out.println("Pagamento cancelado!");
					} if (opPagamento < 1 || opPagamento > 2) { // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida!");
					}// Fim if opPagamento
					
				} if (opPagamento == 3) { // CRÉDITO PARCELADO 2 VEZES
					System.out.println("Valor final: R$ " + c.getValor()
									+ "\nDigite 1: CONFIRMAR PAGAMENTO"
									+ "\nDigite 2: CANCELAR PAGAMENTO");
					opConfirmar = scan.nextInt();
					
					if (opPagamento == 1) { // CONFIRMAR PAGAMENTO
						System.out.println("Pagamento realizado!");
					} if (opPagamento == 2) {
						System.out.println("Pagamento cancelado!");
					} if (opPagamento < 1 || opPagamento > 2) { // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida!");
					}// Fim if opPagamento
					
				} if (opPagamento == 4) { // CRÉDITO PARCELADO 3 VEZES
					c.setCreditoParcela3(c.getValor());
					
					System.out.println("Valor final: R$ " + c.getCreditoParcela3()
									+ "\nDigite 1: CONFIRMAR PAGAMENTO"
									+ "\nDigite 2: CANCELAR PAGAMENTO");
					opConfirmar = scan.nextInt();
					
					if (opPagamento == 1) { // CONFIRMAR PAGAMENTO
						System.out.println("Pagamento realizado!");
					} if (opPagamento == 2) {
						System.out.println("Pagamento cancelado!");
					} if (opPagamento < 1 || opPagamento > 2) { // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida!");
					}// Fim if opPagamento
					
				} if (opPagamento < 1 || opPagamento > 4) { // OPÇÃO INVÁLIDA
					System.out.println("Opção inválida!");
				} // Fim opPagamento
			} if (op < 1 || op > 21) { // OPÇÃO INVÁLIDA
				System.out.println("Opção inválida!");
			} // Fim if op
		}//while (op != 2)
	}//public static void main(String[] args)
}//public class Principal
