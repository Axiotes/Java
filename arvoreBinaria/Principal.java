package arvoreBinaria;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Arvore arvore = new Arvore();
		
		while (true) {
			int op;
			
			System.out.println("Digite 1: Listar árvore\n"
							+ "Digite 2: Adicionar elemento\n"
							+ "Digite 3: Pesquisar elemento\n"
							+ "Digite 4: Excluir elemento");
			op = scan.nextInt();
			
			switch (op) {
			case 1: // LISTAR ÁRVORE
				arvore.listarArvore(arvore.getRaiz());
				
				break;
			
			case 2: // ADICIONAR ELEMENTO
				System.out.println("Digite o elemento que deseja adicionar:");
				arvore.adicionar(scan.nextInt());
				
				System.out.println("Elemento adicionado!");
				
				break;
			
			case 3: // PESQUISAR ELEMENTO
				System.out.println("Digite o elemento que deseja pesquisar:");
				arvore.pesquisarNo(scan.nextInt());
				
				break;
				
			case 4: // EXCLUIR ELEMENTO
				System.out.println("Digite o elemento que deseja excluir");
				arvore.excluir(scan.nextInt());
				
				System.out.println("Elemento excluido!");
				
				break;
				
			default: // OPÇÃO INVÁLIDA
				System.out.println("Opção inválida");
			}//switch (op)
		}//while (true)
	}//public static void main(String[] args)
}//public class Principal
