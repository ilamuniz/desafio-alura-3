package aplicacao;

import models.CartãoDeCredito;
import models.Compras;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitor.nextDouble();
        int sair = 1;

        CartãoDeCredito cartaoDeCredito = new CartãoDeCredito(limite);

        while (sair == 1) {
            System.out.println("Digite a descrição da compra:");
            String descricao = leitor.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitor.nextDouble();

            Compras compras = new Compras(descricao, valor);
            boolean compraRealizada = cartaoDeCredito.adicionarCompra(compras);

            if (compraRealizada == true) {
                System.out.println("-------------------------------------");
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitor.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartaoDeCredito.getCompras());
        for (Compras compra : cartaoDeCredito.getCompras()) {
            System.out.println(compra.getDescricao() + " - R$" + compra.getValor());
        }

        System.out.println("\n-------------------------------------");
        System.out.println("\nSaldo do cartão: " +cartaoDeCredito.getSaldo());
    }
}