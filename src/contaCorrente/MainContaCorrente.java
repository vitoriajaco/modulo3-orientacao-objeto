package contaCorrente;

public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaVitoria = new ContaCorrente("Conta Vitoria", "Vitoria");
        contaVitoria.depositoConta(100);
        contaVitoria.saqueConta(60);
    }
}
