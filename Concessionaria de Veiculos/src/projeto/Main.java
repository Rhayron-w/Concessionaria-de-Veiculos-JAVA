package projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Programa */

public class Main {
    
	public static Scanner scan = new Scanner(System.in);
	public static List<Veiculo> listaVeiculos = new ArrayList<>();
	public static List<Cliente> listaClientes = new ArrayList<>();

	public static void main(String[] args) throws AnoInvalidoException {
	    
		System.out.println("Sistema de Concessionária");
		System.out.println("===========================\n");

		int opcao = 0;
		
		while (opcao != 10) {
			System.out.println("1- Cadastrar Veiculo");
			System.out.println("2- Cadastrar Cliente");
			System.out.println("3- Editar Veiculo");
			System.out.println("4- Editar Cliente");
			System.out.println("5- Deletar Veiculos");
			System.out.println("6- Deletar Clientes");
			System.out.println("7- Listar Veiculos");
			System.out.println("8- Listar Clientes");
			System.out.println("9- Realizar Venda");
			System.out.println("10- Sair");

			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Escolha O tipo do veículo: ");
				System.out.println("===========================\n");
				System.out.println("1- Carro");
				System.out.println("2- Moto");
				System.out.println("3- Utilitário");
				System.out.println("0- Voltar");
				int opt = scan.nextInt();
				scan.nextLine();

				if (opt == 0) break;

				Veiculo novoVeiculo = null;

				if (opt == 1) {
					novoVeiculo = new Carro();
				} else if (opt == 2) {
					novoVeiculo = new Moto();
				} else if (opt == 3) {
					novoVeiculo = new Utilitario();
				} else {
					System.out.println("Opção Inválida");
					break;
				}

				System.out.println("Modelo: ");
				String modelo = scan.nextLine();
				novoVeiculo.setModelo(modelo);

				System.out.println("Fabricante: ");
				String fabricante = scan.nextLine();
				novoVeiculo.setFabricante(fabricante);

				System.out.println("O veículo está disponível para venda (true/false): ");
				Boolean status = scan.nextBoolean();
				novoVeiculo.setStatus(status);

				System.out.println("Ano de fabricação: ");
				int ano = scan.nextInt();
				novoVeiculo.setAno(ano);
				scan.nextLine();

				listaVeiculos.add(novoVeiculo);
				System.out.println("Veículo cadastrado com sucesso!");
				break;

			case 2:
				System.out.println("Escolha entre pessoa Física ou Jurídica:");
				System.out.println("1- Pessoa Física");		
				System.out.println("2- Pessoa Jurídica");
				System.out.println("0= Sair");
				int optPessoa = scan.nextInt();

				if (optPessoa == 0) break;

				Cliente novoCliente = null;

				if (optPessoa == 1) {
					PessoaF pf = new PessoaF();
					System.out.println("Nome:");
					String nomeF = scan.nextLine();
					pf.setNome(nomeF);
					System.out.println("Contato:"); 	
					int contatoF = scan.nextInt();
					scan.nextLine();
					pf.setContato(contatoF);
					System.out.println("CPF:");
					String cpfF = scan.nextLine();
					pf.setCPF(cpfF);

					novoCliente = pf;
					listaClientes.add(novoCliente);

				} else if (optPessoa == 2) {
					PessoaJ pj = new PessoaJ();
					System.out.println("Nome:");
					String nomeJ = scan.nextLine();
					pj.setNome(nomeJ);
					System.out.println("Contato:"); 	
					int contatoJ = scan.nextInt();
					scan.nextLine();
					pj.setContato(contatoJ);
					System.out.println("CNPJ:");
					String cnpj = scan.nextLine();
					pj.setCNPJ(cnpj);

					novoCliente = pj;
					listaClientes.add(novoCliente);
				}	
				break;
			case 3:
				if (listaVeiculos.isEmpty()) {
					System.out.println("Cadastre um veículo para editar");
				} else {
					Veiculo v = listaVeiculos.get(0);
					System.out.println("Modelo: ");
					String modeloNovo = scan.nextLine();
					v.setModelo(modeloNovo);

					System.out.println("Fabricante: ");
					String fabricanteNovo = scan.nextLine();
					v.setFabricante(fabricanteNovo);

					System.out.println("O veículo está disponível para venda (true/false): ");
					Boolean statusNovo = scan.nextBoolean();
					v.setStatus(statusNovo);

					System.out.println("Ano de fabricação: ");
					int anoNovo = scan.nextInt();
					v.setAno(anoNovo);
					scan.nextLine();

					} 
				break;
			case 4:
				if (listaClientes.isEmpty()) {
					System.out.println("Cadastre um cliente para editar");
				} else {
					Cliente c = listaClientes.get(0);

					System.out.println("Nome:");
					String nomeNovo = scan.nextLine();
					c.setNome(nomeNovo);

					System.out.println("Contato:"); 	
					int contatoNovo = scan.nextInt();
					c.setContato(contatoNovo);
					scan.nextLine();
				}
				break;
			case 5:
				if (!listaVeiculos.isEmpty()) {
					listaVeiculos.clear();
					System.out.println("Veículos removidos");
				}
				break;
			case 6:
				if (!listaClientes.isEmpty()) {
					listaClientes.clear();
					System.out.println("Cliente removido");
				}
				break;
			case 7:
				if (listaVeiculos.isEmpty()) {
					System.out.println("Nenhum veículo cadastrado");
				} else {
					for (Veiculo v : listaVeiculos) {
					v.mostrarInformacao();
					System.out.println("------------------------");
					}
				}
				break;
			case 8:
				if (listaClientes.isEmpty()) {
					System.out.println("Nenhum cliente cadastrado");
				}
				for (Cliente c : listaClientes) {
					c.mostrarInformacao();
					System.out.println("------------------------");
					}
				break;
			case 9:
				if (listaVeiculos.isEmpty()) {
					System.out.println("Cadastre um veículo para editar");
				} else {
					listaVeiculos.get(0).realizarVenda();
				}
				break;
			case 10:
				System.out.println("Saindo...");
				break;
			}	
		}
	} 
}
