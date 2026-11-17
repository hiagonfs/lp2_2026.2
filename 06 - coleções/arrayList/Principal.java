package codigo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Scanner teclado = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("\n=== MENU DO BANCO ===");
			System.out.println("1 - Cadastrar conta");
			System.out.println("2 - Pesquisar conta");
			System.out.println("3 - Remover conta");
			System.out.println("4 - Mostrar quantidade de contas");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = teclado.nextLine().trim();

			switch (opcao) {
			case "1": {
				System.out.print("Nome do titular: ");
				String titular = teclado.nextLine();
				System.out.print("Identificador da conta: ");
				String identificador = teclado.nextLine();

				banco.addConta(titular, identificador);
				System.out.println("Conta cadastrada.");
				break;
			}

			case "2": {
				System.out.print("Identificador da conta: ");
				String identificador = teclado.nextLine();
				Conta conta = banco.pesquisarContaPeloIdentificador(identificador);

				if (conta == null) {
					System.out.println("Conta não encontrada.");
				} else {
					System.out.println("Identificador: " + conta.getIdentificador());
					System.out.println("Titular: " + conta.getTitular());
					System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
				}
				break;
			}

			case "3": {
				System.out.print("Identificador da conta: ");
				String identificador = teclado.nextLine();

				if (banco.pesquisarContaPeloIdentificador(identificador) == null) {
					System.out.println("Conta não encontrada.");
				} else {
					banco.removerConta(identificador);
					System.out.println("Conta removida.");
				}
				break;
			}

			case "4":
				System.out.println("Quantidade de contas: " + banco.getTamanhoDaLista());
				break;

			case "0":
				System.out.println("Programa encerrado.");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (!opcao.equals("0"));

		teclado.close();
	}
}
