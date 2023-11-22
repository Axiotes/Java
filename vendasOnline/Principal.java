package vendasOnline;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Produtos p = new Produtos();
		
		// Instanciamentos Roupa
		Roupa camisa = new Roupa("Camisa", 60, 30);
		Roupa calca = new Roupa("Calça", 70, 5);
		Roupa bermuda = new Roupa("Bermuda", 50, 20);
		Roupa vestido = new Roupa("Vestido", 85, 15);
		
		// Instanciamento Eletronicos
		Eletronicos celular = new Eletronicos("Celular", 1500, 5, 10);
		Eletronicos computador = new Eletronicos("Computador", 2000, 220, 25);
		Eletronicos tv = new Eletronicos("TV", 1800, 220, 2);
		
		int op = 0;
		
		while (op != 3) { // LOOP MENU VENDAS
			System.out.println("-------- MENU VENDAS ONLINE --------\n"
							+ "Digite 1: ROUPAS\n"
							+ "Digite 2: ELETRÔNICOS\n"
							+ "Digite 3: SAIR");
			op = scan.nextInt(); // Selecionar opção do menu vendas online
			
			switch (op) { // switch OPÇÃO NO MENU VENDAS ONLINE
			case 1: // ROUPAS
				int opRoupa = 0;
				
				while (opRoupa != 5) { // LOOP MENU ROUPAS
					System.out.println("-------- MENU ROUPAS --------\n"
									+ "Digite 1: " + camisa.getNome() + " - Preço: " + camisa.getPreco()
									+ "\nDigite 2: " + calca.getNome() + " - Preço: " + calca.getPreco()
									+ "\nDigite 3: " + bermuda.getNome() + " - Preço: " + bermuda.getPreco()
									+ "\nDigite 4: " + vestido.getNome() + " - Preço: " + vestido.getPreco()
									+ "\nDigite 5: VOLTAR");
					opRoupa = scan.nextInt(); // Selecionar opção menu roupas
					
					switch (opRoupa) { // switch OPÇÃO NO MENU ROUPAS
					case 1: // CAMISA
						if (camisa.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE 
							// TEM ROUPA NO ESTOQUE
						
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque: " + camisa.getQuantidadeEmEstoque()
											+ "\nDigite a cor desejada:");
							camisa.setCor(scan.next()); // Mostrar a quantidade em estoque e digitar cor 
							
							System.out.println("Digite o tamanho da camisa:");
							camisa.setTamanho(scan.next()); // Digitar tamanho
							
							camisa.setCor(camisa.getCor().toUpperCase()); // Cor digitada toda em maiúsculo
							camisa.setTamanho(camisa.getTamanho().toUpperCase()); // Tamanho digitado todo em maiúsculo
							
							camisa.setValorFinal(camisa.custoEnvio() + camisa.getPreco()); // Calculo custo de envio e preço final
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Roupa: " + camisa.getNome()
											+ "\nCor: " + camisa.getCor()
											+ "\nTamanho: " + camisa.getTamanho()
											+ "\nPreço da roupa: " + camisa.getPreco()
											+ "\nCusto de envio: " + camisa.custoEnvio()
											+ "\nPreço final: " + camisa.getValorFinal()
											+ "\n-------------------------"
											+ "\nDigite 1: CONFIRMAR COMPRA"
											+ "\nDigite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Mostrar informações da compra e selecionar confirmação
							
							switch (confirmar) { // switch CONFIRMAÇÃO DE COMPRA
							case 1: // CONFIRMAR COMPRA
								camisa.setQuantidadeEmEstoque(camisa.getQuantidadeEmEstoque() - 1); // Tirar peça vendida do estoque
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida");
							}//switch (confirmar)
						} else { // NÃO TEM ROUPA NO ESTOQUE
							System.out.println("Essa peça de roupa não tem mais estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 1 CAMISA 
						
					case 2: // CALÇA
						if (calca.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE 
							// TEM ROUPA NO ESTOQUE
						
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque: " + calca.getQuantidadeEmEstoque()
											+ "\nDigite a cor desejada:");
							calca.setCor(scan.next()); // Mostrar a quantidade em estoque e digitar cor 
							
							System.out.println("Digite o tamanho da calça:");
							calca.setTamanho(scan.next()); // Digitar tamanho
							
							calca.setCor(calca.getCor().toUpperCase()); // Cor digitada toda em maiúsculo
							calca.setTamanho(calca.getTamanho().toUpperCase()); // Tamanho digitado todo em maiúsculo
							
							calca.setValorFinal(calca.custoEnvio() + calca.getPreco()); // Calculo custo de envio e preço final
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Roupa: " + calca.getNome()
											+ "\nCor: " + calca.getCor()
											+ "\nTamanho: " + calca.getTamanho()
											+ "\nPreço da roupa: " + calca.getPreco()
											+ "\nCusto de envio: " + calca.custoEnvio()
											+ "\nPreço final: " + calca.getValorFinal()
											+ "\n-------------------------"
											+ "\nDigite 1: CONFIRMAR COMPRA"
											+ "\nDigite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Mostrar informações da compra e selecionar confirmação
							
							switch (confirmar) { // switch CONFIRMAÇÃO DE COMPRA
							case 1: // CONFIRMAR COMPRA
								calca.setQuantidadeEmEstoque(calca.getQuantidadeEmEstoque() - 1); // Tirar peça vendida do estoque
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida");
							}//switch (confirmar)
						} else { // NÃO TEM ROUPA NO ESTOQUE
							System.out.println("Essa peça de roupa não tem mais estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 2 CALÇA
						
					case 3: // BERMUDA
						if (bermuda.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE 
							// TEM ROUPA NO ESTOQUE
						
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque: " + bermuda.getQuantidadeEmEstoque()
											+ "\nDigite a cor desejada:");
							bermuda.setCor(scan.next()); // Mostrar a quantidade em estoque e digitar cor 
							
							System.out.println("Digite o tamanho da calça:");
							bermuda.setTamanho(scan.next()); // Digitar tamanho
							
							bermuda.setCor(bermuda.getCor().toUpperCase()); // Cor digitada toda em maiúsculo
							bermuda.setTamanho(bermuda.getTamanho().toUpperCase()); // Tamanho digitado todo em maiúsculo
							
							bermuda.setValorFinal(bermuda.custoEnvio() + bermuda.getPreco()); // Calculo custo de envio e preço final
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Roupa: " + bermuda.getNome()
											+ "\nCor: " + bermuda.getCor()
											+ "\nTamanho: " + bermuda.getTamanho()
											+ "\nPreço da roupa: " + bermuda.getPreco()
											+ "\nCusto de envio: " + bermuda.custoEnvio()
											+ "\nPreço final: " + bermuda.getValorFinal()
											+ "\n-------------------------"
											+ "\nDigite 1: CONFIRMAR COMPRA"
											+ "\nDigite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Mostrar informações da compra e selecionar confirmação
							
							switch (confirmar) { // switch CONFIRMAÇÃO DE COMPRA
							case 1: // CONFIRMAR COMPRA
								bermuda.setQuantidadeEmEstoque(bermuda.getQuantidadeEmEstoque() - 1); // Tirar peça vendida do estoque
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida");
							}//switch (confirmar)
						} else { // NÃO TEM ROUPA NO ESTOQUE
							System.out.println("Essa peça de roupa não tem mais estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 3 BERMUDA
					
					case 4: // VESTIDO
						if (vestido.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE 
							// TEM ROUPA NO ESTOQUE
						
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque: " + vestido.getQuantidadeEmEstoque()
											+ "\nDigite a cor desejada:");
							vestido.setCor(scan.next()); // Mostrar a quantidade em estoque e digitar cor 
							
							System.out.println("Digite o tamanho da calça:");
							vestido.setTamanho(scan.next()); // Digitar tamanho
							
							vestido.setCor(vestido.getCor().toUpperCase()); // Cor digitada toda em maiúsculo
							vestido.setTamanho(vestido.getTamanho().toUpperCase()); // Tamanho digitado todo em maiúsculo
							
							vestido.setValorFinal(vestido.custoEnvio() + vestido.getPreco()); // Calculo custo de envio e preço final
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Roupa: " + vestido.getNome()
											+ "\nCor: " + vestido.getCor()
											+ "\nTamanho: " + vestido.getTamanho()
											+ "\nPreço da roupa: " + vestido.getPreco()
											+ "\nCusto de envio: " + vestido.custoEnvio()
											+ "\nPreço final: " + vestido.getValorFinal()
											+ "\n-------------------------"
											+ "\nDigite 1: CONFIRMAR COMPRA"
											+ "\nDigite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Mostrar informações da compra e selecionar confirmação
							
							switch (confirmar) { // switch CONFIRMAÇÃO DE COMPRA
							case 1: // CONFIRMAR COMPRA
								vestido.setQuantidadeEmEstoque(vestido.getQuantidadeEmEstoque() - 1); // Tirar peça vendida do estoque
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida");
							}//switch (confirmar)
						} else { // NÃO TEM ROUPA NO ESTOQUE
							System.out.println("Essa peça de roupa não tem mais estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 4 VESTIDO
						
					case 5: // VOLTAR
						System.out.println("");
						
						break;
					// Fim case 5 VOLTAR
						
					default: // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida! Tente novamente");
					}//switch (opRoupa)
				}//while (opRoupa != 5)
				
				break;
			// Fim case 1 ROUPAS
				
			case 2: // ELETRÔNICOS
				int opEletronico = 0;
				
				while (opEletronico != 4) { // LOOP MENU ELETRÔNICOS
					System.out.println("-------- MENU ELETRÔNICOS --------\n"
									+ "\nDigite 1: " + celular.getNome() + " - Preço: " + celular.getPreco()
									+ "\nDigite 2: " + computador.getNome() + " - Preço: " + computador.getPreco()
									+ "\nDigite 3: " + tv.getNome() + " - Preço: " + tv.getPreco()
									+ "\nDigite 4: VOLTAR");
					opEletronico = scan.nextInt(); // Selecionar opção menu eletrônico
					
					switch (opEletronico) { // switch OPÇÃO NO MENU ELETRÔNICO
					case 1: // CELULAR
						if (celular.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE
							// TEM NO ESTOQUE
							
							celular.setValorFinal(celular.custoEnvio() + celular.getPreco()); // Calculo do custo de envio e preço final
							
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque:" + celular.getQuantidadeEmEstoque()
											+ "\n-------------------------"
											+ "\nEletrônico: " + celular.getNome()
											+ "\nVoltagem: " + celular.getVoltagem()
											+ "\nPreço: " + celular.getPreco()
											+ "\nCusto de envio: " + celular.custoEnvio()
											+ "\nPreço final: " + celular.getValorFinal());
							// Quantidade em estoque e informações da compra
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Digite 1: CONFIRMAR COMPRA\n"
											+ "Digite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Confirmação da compra
							
							switch (confirmar) {
							case 1: // CONFIRMAR COMPRA
								celular.setQuantidadeEmEstoque(celular.getQuantidadeEmEstoque() - 1); // Tirar eletrônico vendido
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida! Tente novamente");
							}//switch (confirmar)
						} else { // NÃO TEM NO ESTOQUE
							System.out.println("Esse eletrônico não tem mais no estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 1 CELULAR
						
					case 2: // COMPUTADOR
						if (computador.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE
							// TEM NO ESTOQUE
							
							computador.setValorFinal(computador.custoEnvio() + computador.getPreco()); // Calculo do custo de envio e preço final
							
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque:" + computador.getQuantidadeEmEstoque()
											+ "\n-------------------------"
											+ "\nEletrônico: " + computador.getNome()
											+ "\nVoltagem: " + computador.getVoltagem()
											+ "\nPreço: " + computador.getPreco()
											+ "\nCusto de envio: " + computador.custoEnvio()
											+ "\nPreço final: " + computador.getValorFinal());
							// Quantidade em estoque e informações da compra
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Digite 1: CONFIRMAR COMPRA\n"
											+ "Digite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Confirmação da compra
							
							switch (confirmar) {
							case 1: // CONFIRMAR COMPRA
								computador.setQuantidadeEmEstoque(computador.getQuantidadeEmEstoque() - 1); // Tirar eletrônico vendido
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida! Tente novamente");
							}//switch (confirmar)
						} else { // NÃO TEM NO ESTOQUE
							System.out.println("Esse eletrônico não tem mais no estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 2 COMPUTADOR
						
					case 3: // TV
						if (tv.getQuantidadeEmEstoque() > 0) { // if VERIFICAR ESTOQUE
							// TEM NO ESTOQUE
							
							tv.setValorFinal(tv.custoEnvio() + tv.getPreco()); // Calculo do custo de envio e preço final
							
							System.out.println("--------------------------\n"
											+ "Quantidade em estoque:" + tv.getQuantidadeEmEstoque()
											+ "\n-------------------------"
											+ "\nEletrônico: " + tv.getNome()
											+ "\nVoltagem: " + tv.getVoltagem()
											+ "\nPreço: " + tv.getPreco()
											+ "\nCusto de envio: " + tv.custoEnvio()
											+ "\nPreço final: " + tv.getValorFinal());
							// Quantidade em estoque e informações da compra
							
							int confirmar = 0;
							
							System.out.println("-------------------------\n"
											+ "Digite 1: CONFIRMAR COMPRA\n"
											+ "Digite 2: CANCELAR COMPRA");
							confirmar = scan.nextInt(); // Confirmação da compra
							
							switch (confirmar) {
							case 1: // CONFIRMAR COMPRA
								tv.setQuantidadeEmEstoque(tv.getQuantidadeEmEstoque() - 1); // Tirar eletrônico vendido
								System.out.println("Compra confirmada!");
								
								break;
							// Fim case 1 CONFIRMAR COMPRA
								
							case 2: // CANCELAR COMPRA
								System.out.println("Compra cancelada!");
								
								break;
							// Fim case 2 CANCELAR COMPRA
								
							default: // OPÇÃO INVÁLIDA
								System.out.println("Opção inválida! Tente novamente");
							}//switch (confirmar)
						} else { // NÃO TEM NO ESTOQUE
							System.out.println("Esse eletrônico não tem mais no estoque");
						} // Fim if VERIFICAR ESTOQUE
						
						break;
					// Fim case 3 TV
						
					case 4: // VOLTAR
						break;
					// Fim case 4 VOLTAR
						
					default: // OPÇÃO INVÁLIDA
						System.out.println("Opção inválida! Tente novamente");
					}//switch (opEletrônico)
				}//while (opEletronico != 4)
				
				break;
			// Fim case 2 ELETRÔNICOS
				
			case 3: // FINALIZAR PROGRAMA
				System.out.println("Programa finalizado");
				
				break;
			// Fim case 3
				
			default: // OPÇÃO INVÁLIDA
				System.out.println("Opção inválida! Tente novamente");
			}//switch (op)
		}//while (op != 3) 
	}//public static void main(String[] args)
}//public class Principal