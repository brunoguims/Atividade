package questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.print("Digite a opção desejada: ");
        int opcao = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double resultado = 0;

        if (opcao == 1) {
            resultado = num1 + num2;
        } else if (opcao == 2) {
            resultado = num1 - num2;
        } else if (opcao == 3) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero!");
            }
        } else if (opcao == 4) {
            resultado = num1 * num2;
        } else {
            System.out.println("Opção inválida!");
        }

        System.out.println("Resultado: " + resultado);

        input.close();
    }
}