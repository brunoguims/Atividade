package questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;

        int opcao;

        do {
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$" + String.format("%.2f", saldo));
            } else if (opcao == 2) {
                System.out.print("Digite o valor a depositar: ");
                double valorDeposito = input.nextDouble();
                if (valorDeposito > 0) {
                    saldo += valorDeposito;
                    System.out.println("Depósito de R$" + String.format("%.2f", valorDeposito) + " realizado.");
                } else {
                    System.out.println("Valor inválido para depósito.");
                }
            } else if (opcao == 3) {
                if (saldo > 0) {
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = input.nextDouble();
                    if (valorSaque > 0 && saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saque de R$" + String.format("%.2f", valorSaque) + " realizado.");
                    } else if (valorSaque <= 0) {
                        System.out.println("Valor inválido para saque.");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                } else {
                    System.out.println("Saldo zerado. Não é possível sacar.");
                }
            } else if (opcao == 0) {
                System.out.println("Saindo do sistema.");
            } else {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        input.close();
    }
}