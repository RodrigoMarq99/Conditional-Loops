package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String vertebrado;
		String tipo;
		String alimentacao;
		
		System.out.println("Vertebrado ou Invertebrado?");
		vertebrado = leia.nextLine();
		
		if (vertebrado.equals("vertebrado")) {
			System.out.println("Ave ou Mamífero?");
			tipo = leia.nextLine();
			if (tipo.equals("ave")) {
				System.out.println("Carnívoro ou Onívoro?");
				alimentacao = leia.nextLine();
				if(alimentacao.equals("carnivoro")) {
					System.out.println("Águia");
				}else if (alimentacao.equals("onivoro")){
					System.out.println("Pomba");
				}
			}else if(tipo.equals("mamifero")){
				System.out.println("Onívoro ou Herbívoro?");
				alimentacao = leia.nextLine();
				if(alimentacao.equals("onivoro")) {
					System.out.println("Homem");
				}else if(alimentacao.equals("herbivoro")) {
					System.out.println("Vaca");
				}
			}
			
			
		}else if(vertebrado.equals("invertebrado")) {
			System.out.println("Inseto ou Anelídeo?");
			tipo = leia.nextLine();
			if (tipo.equals("inseto")) {
				System.out.println("Hermatófago ou Herbívoro?");
				alimentacao = leia.nextLine();
				if(alimentacao.equals("hematofago")) {
					System.out.println("Pulga");
				}else if(alimentacao.equals("herbivoro")){
					System.out.println("Largarta");
				}
			}else if(tipo.equals("anelideo")){
				System.out.println("Hermatófago ou Onívoro?");
				alimentacao = leia.nextLine();
				if(alimentacao.equals("hematofago")) {
					System.out.println("Sanguessuga");
				}else if (alimentacao.equals("onivoro")){
					System.out.println("Minhoca");
				}
			}
			
		}
		
	}

}
