package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int A, B, C, soma;
		
		System.out.println("Valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Valor de C: ");
		C = leia.nextInt();
		
		soma = A + B;
		
		if (soma > C) {
			System.out.println("\nA Soma de A + B é Maior do que C.");
		} else if (soma == C) {
			System.out.println("\nA Soma de A + B é Igual a C.");
		} else {
			System.out.println("\nA Soma de A + B é Menor do que C");
		}
	}

}
