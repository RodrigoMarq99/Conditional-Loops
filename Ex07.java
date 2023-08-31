package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String op ="";
		int operacao;
		float numero1, numero2, valor = 0f;
		
		System.out.println("\nDigite o 1º número: ");
		numero1 = leia.nextFloat();
		System.out.println("\nDigite o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nOperação matemática:");
		System.out.println("\n1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1: System.out.println("Soma");
		valor = numero1 + numero2;
		op = "+";
		break;
		case 2: System.out.println("Subtração");
		valor = numero1 - numero2;
		op = "-";
		break;
		case 3: System.out.println("Multiplicação");
		valor = numero1 * numero2;
		op = "x";
		break;
		case 4: System.out.println("Divisão");
		valor = numero1 / numero2;
		op = "/";
		break;
		default: System.out.println("Operação Inválida!");
		}
		
		
		System.out.printf("\n%.2f %s %.2f = %.2f", numero1, op, numero2, valor);
	}

}