package questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno " + nome + ": " + media);

        if (media >= 70) {
            System.out.println("Aprovado");
        } else if (media < 40) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Na final");
        }

        input.close();
    }
}