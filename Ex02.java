package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if (num > 0 && (num % 2) == 0){
			System.out.println("O Número " + num + " é par e positivo!");
		} else if (num > 0 && (num % 2) == 1) {
			System.out.println("O Número " + num + " é ímpar e positivo!");
		}else if (num < 0 && (num % 2) == 0) {
			System.out.println("O Número " + num + " é par e negativo!");
		}else if (num < 0 && (num % 2) == 1) {
			System.out.println("O Número " + num + " é ímpar e negativo!");
		}else {
			System.out.println("O Número é 0.");
		}
		
	}

}
