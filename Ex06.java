package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		String nomeCargo = "";
		int cargo;
		float reajuste = 0, salario, novoSalario;
		
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Selecione seu cargo:");
		System.out.println("1-Gerente, 2-Vendedor, 3-Supervisor, 4-Motorista, 5-Estoquista, 6-Técnico de TI");
		cargo = leia.nextInt();
		
		switch(cargo) {
		case 1: System.out.println("Você é Gerente!");
		reajuste = 1.10f;
		nomeCargo = "Gerente";
		break;
		case 2: System.out.println("Você é Vendedor!");
		reajuste = 1.07f;
		nomeCargo = "Vendedor";
		break;
		case 3: System.out.println("Você é Supervisor!");
		reajuste = 1.09f;
		nomeCargo = "Supervisor";
		break;
		case 4: System.out.println("Você é Motorista!");
		reajuste = 1.06f;
		nomeCargo = "Motorista";
		break;
		case 5: System.out.println("Você é Estoquista!");
		reajuste = 1.05f;
		nomeCargo = "Estoquista";
		break;
		case 6: System.out.println("Você é Técnico de TI!");
		reajuste = 1.08f;
		nomeCargo = "Técnico de TI";
		break;
		default: System.out.println("Cargo inexistente");
		}
		
		System.out.println("Seu salário: ");
		salario = leia.nextFloat();
		
		novoSalario = salario * reajuste;
		
		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + nomeCargo);
		System.out.printf("Salário: R$%.2f", novoSalario);
	}

}