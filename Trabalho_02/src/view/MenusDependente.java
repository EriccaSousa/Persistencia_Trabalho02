package view;

import java.util.Scanner;

import controller.DependenteCRUD;

public class MenusDependente {
	static Scanner read = new Scanner(System.in);
	static int opcao;

	public static void menuInicialByDependente() {
		do {
			System.out.println("Menu Dependentes:");
			System.out.println(
					"[ 1 ] Cadastrar Dependentes\n[ 2 ] Buscar Dependentes \n[ 3 ] Deletar Dependentes \n[ 4 ] Voltar ");
			System.out.print("Escolha uma opção: ");
			opcao = read.nextInt();

			switch (opcao) {
			case 1:
				DependenteCRUD.criarDependente();
				break;
			case 2:
				menuBuscarByDependente();
				break;
			case 3:
				DependenteCRUD.deleteByNome();
				break;
			case 4:
				MenusIniciais.menuInicial();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (true);
	}

	public static void menuBuscarByDependente() {
		do {
			System.out.println("Menu Pesquisar Dependentes:");
			System.out.println("[ 1 ] Listar todos os Dependentes\n[ 2 ] Buscar Dependentes por nome\n[ 3 ] Voltar ");
			System.out.print("Escolha uma opção: ");
			opcao = read.nextInt();

			switch (opcao) {
			case 1:
				DependenteCRUD.findAll();
				break;
			case 2:
				System.out.println("\n" + DependenteCRUD.findByNome() + "\n");
				break;
			case 3:
				menuInicialByDependente();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (true);
	}

}
