package Caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Caixa contaVitoria = new Caixa();


        System.out.println("Você deseja realizar quantas operações?");
        Scanner input = new Scanner(System.in);
        int operacoes = input.nextInt();
        for (int i = 1; i <= operacoes; i++) {
            System.out.println("Digite a " + i + " operação");
            operacoes = input.nextInt();

        }

        System.out.println("Deseja pagar débito ou crédito?, digite 1 para crédito e 2 para débito ");
        //Scanner input = new Scanner(System.in);
        int respostaUsuario = input.nextInt();
        if (respostaUsuario == 1) {
            contaVitoria.creditoBanco();

        } else if (respostaUsuario == 2) {
            contaVitoria.debitoBanco();
        }

       // contaVitoria.creditoBanco();
        // contaVitoria.debitoBanco();


    }
}
