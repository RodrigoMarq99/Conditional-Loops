package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String operacao = "";
        float saldo = 1000.0f;

        System.out.println("Escolha a operação a ser realizada:");
        System.out.println("\n1 - Saldo | 2 - Saque | 3 - Depósito");

        int opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                operacao = "Saldo";
                break;
            case 2:
                operacao = "Saque";
                System.out.println("\nDigite o valor a ser sacado: ");
                float saque = leia.nextFloat();
                if (saque <= saldo) {
                    saldo -= saque;
                } else {
                    System.out.println("\nSaldo Insuficiente!");
                    return;
                }
                break;
            case 3:
                operacao = "Depósito";
                System.out.println("\nDigite o valor a ser depositado: ");
                float deposito = leia.nextFloat();
                saldo += deposito;
                break;
            default:
                System.out.println("\nOperação Inválida!");
                return;
        }

        System.out.println("\nOperação - " + operacao);
        System.out.printf("Novo Saldo: R$%.2f", saldo);

        leia.close();
    }
}