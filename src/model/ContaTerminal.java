package model;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private double saldo;
    private String nome;

    public ContaTerminal(int numero, String agencia, double saldo, String nome) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá " + this.nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                this.agencia + ", conta " +
                this.numero + " e seu saldo de " +
                this.saldo + " está disponível para saque";
    }
}
