package questao03;

public class Main {
    public static void main(String[] args) {
        String nomeProduto = "Camiseta";
        double precoProduto = 25.99;
        int estoqueProduto = 50;

        int quantidadeAdicionar = 20;
        estoqueProduto = estoqueProduto + quantidadeAdicionar;
        System.out.println(quantidadeAdicionar + " unidades de " + nomeProduto + " adicionadas. Novo estoque: " + estoqueProduto);

        int quantidadeVender = 10;
        if (estoqueProduto >= quantidadeVender) {
            estoqueProduto = estoqueProduto - quantidadeVender;
            System.out.println(quantidadeVender + " unidades de " + nomeProduto + " vendidas. Novo estoque: " + estoqueProduto);
        } else {
            System.out.println("Estoque insuficiente para vender " + quantidadeVender + " unidades de " + nomeProduto + ".");
        }

        System.out.println("Estoque final de " + nomeProduto + ": " + estoqueProduto + " unidades.");
    }
}