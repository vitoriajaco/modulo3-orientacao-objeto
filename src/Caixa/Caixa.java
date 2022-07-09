package Caixa;

import java.util.Scanner;

public class Caixa {
    double credito;
    double debito;

    double saldo = 1000;

    double valorAplicado;

    double valorPagoDebito;

    public Caixa() {
        this.credito = credito;
        this.debito = debito;
        this.saldo = saldo;
    }

    public void creditoBanco() {
        System.out.println("Quanto você deseja aplicar no crédito? ");
        Scanner input = new Scanner(System.in);
        valorAplicado = input.nextDouble();
        this.credito = valorAplicado;
        saldo += credito;
        System.out.printf("Você possui no crédito o valor de R$ %s%n", this.saldo);

    }

    public void debitoBanco() {
        System.out.println("Quanto você deseja pagar no débito? ");
        Scanner input2 = new Scanner(System.in);
        valorPagoDebito = input2.nextDouble();
        this.debito = (valorPagoDebito);
        saldo -= debito;
        System.out.println("Você pagou a quantia de " + valorPagoDebito + " seu saldo final é de " + saldo);

    }
}



