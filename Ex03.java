package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraVez;
		
		System.out.println("Digite o Nome do doador: ");
		nome = ler.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = ler.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraVez = ler.nextBoolean();
		
		
		if (idade >= 18 && idade <= 69){
			if (idade >= 60) {
				if(primeiraVez == true) {
					System.out.println(nome + " não está apto para doar sangue!");
				}else {
					System.out.println(nome + " está apto para doar sangue!");
				}
			}
			else {
				System.out.println(nome + " está apto para doar sangue!");
			}
		}else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
	}

}
