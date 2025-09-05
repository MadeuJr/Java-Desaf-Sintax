import model.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, agencia;
        int numero;
        double saldo;

        System.out.println("Bem vindo ao banco terminal");
        System.out.println("Por favor, insira sua agência:");
        System.out.printf("\nAgência: ");
        agencia = sc.nextLine();
        System.out.println("Por favor, insira sua conta:");
        System.out.printf("\nConta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, insira seu nome:");
        System.out.printf("\nNome: ");
        nome = sc.nextLine();
        System.out.println("Por favor, seu saldo:");
        System.out.printf("\nSaldo: ");
        saldo = Double.parseDouble(sc.nextLine());

        sc.close();
        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, saldo, nome);

        System.out.println(contaTerminal);

    }
}
