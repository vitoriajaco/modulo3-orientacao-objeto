package Caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Caixa contaVitoria = new Caixa();
        //System.out.println("Deseja pagar débito ou crédito?, digite 1 para crédito e 2 para débito ");
        //Scanner input = new Scanner(System.in);
        //int respostaUsuario = input.nextInt();
       // if (respostaUsuario == 1) {
            //contaVitoria.creditoBanco();

       // } else if (respostaUsuario == 2) {
         //   contaVitoria.debitoBanco();
     //   }
        boolean repetir = true;
        while (repetir) {
            System.out.println("Deseja pagar débito ou crédito?, digite 1 para crédito e 2 para débito ");
            Scanner input = new Scanner(System.in);
            int respostaUsuario = input.nextInt();
            if (respostaUsuario == 1){
                contaVitoria.creditoBanco();
            } else if (respostaUsuario == 2) {
                contaVitoria.debitoBanco();
            }

            System.out.println("Deseja realizar uma nova operação? digita s para sim e n para não");
            new Scanner(System.in);
            String respostaUsuario2 = input.next();
            if (respostaUsuario2.equalsIgnoreCase("s")){
                repetir = true;
            } else if (respostaUsuario2.equalsIgnoreCase("n")) {
                System.out.println("Fim da operacao");
                System.out.println("Seu saldo é de " + contaVitoria.saldo);
                break;

            }

        }


    }
}
