package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome = "nome";
		int item, quantidade;
		float valor = 0, total;
		
		System.out.println("Códigos do Produtos: 1-Cachorro Quente, 2-X-Salada, 3-X-Bacon, 4-Bauru, 5-Refrigerante, 6-Suco de laranja");
		item = leia.nextInt();
		
		switch(item) {
		case 1: System.out.println("Cachorro Quente");
		valor = 10;
		nome = "Cachorro Quente";
		break;
		case 2: System.out.println("X-Salada");
		valor = 15;
		nome = "X-Salada";
		break;
		case 3: System.out.println("X-Bacon");
		valor = 18;
		nome = "X-Bacon";
		break;
		case 4: System.out.println("Bauru");
		valor = 12;
		nome = "Bauru";
		break;
		case 5: System.out.println("Refrigerante");
		valor = 8;
		nome = "Refrigerante";
		break;
		case 6: System.out.println("Suco de laranja");
		valor = 13;
		nome = "Suco de laranja";
		break;
		default: System.out.println("Produto inexistente");
		}
		
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		total = valor * quantidade;
		
		System.out.printf("Você solicitou %d %s. O total ficou R$%.2f.", quantidade, nome, total);
	}

}