package loja;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario f = new Funcionario();
		Vendedores v = new Vendedores();
		Administrativo a = new Administrativo();
		
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("DIGITE 1: ADMINISTRATIVO\n"
							+ "DIGITE 2: VENDEDORES\n"
							+ "DIGITE 3: SAIR");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: // ADMINISTRATIVO
				System.out.println("Digite seu nome:");
				a.setNome(scan.next());
				
				System.out.println("Digite seu RG:");
				a.setRg(scan.nextInt());
				
				System.out.println("Salário base:");
				a.setSalarioBase(scan.nextDouble());
				
				System.out.println("Quantidade de horas extras:");
				a.setHoraExtra(scan.nextDouble());
				
				System.out.println("Salário final: " + a.getSalarioFinal());
				break;
				// FIM CASE 1
				
			case 2: // VENDEDORES
				System.out.println("Digite seu nome:");
				v.setNome(scan.next());
				
				System.out.println("Digite seu RG:");
				v.setRg(scan.nextInt());
				
				System.out.println("Salário base:");
				v.setSalarioBase(scan.nextDouble());
				
				System.out.println("Quantidade de vendas:");
				v.setVendas(scan.nextDouble());
				
				System.out.println("Salário final: " + v.getSalarioFinal());
				break;
				// FIM CASE 2
				
			case 3: // FINALIZAR PROGRAMA
				System.out.println("");
				break;
				
			default:
				System.out.println("Opção inválida! Tente novamente");
				break;
			}//switch (opcao)
		}//while (opcao != 3)
	}//public static void main(String[] args)
} //public class Principal
