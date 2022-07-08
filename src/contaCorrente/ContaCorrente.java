package contaCorrente;

public class ContaCorrente {
           private String nomeDaConta;
        private String nomeDoCorrentista;
        private Double saldo;

        public ContaCorrente(String nomeDaConta, String nomeDoCorrentista) {
            this.nomeDaConta = nomeDaConta;
            this.nomeDoCorrentista = nomeDoCorrentista;
            this.saldo = 0.0;
        }

    public double depositoConta(double deposito) {
        System.out.println("Você depositou " + deposito);
        return 0;
    }

    public double saqueConta(double saque) {
        System.out.println("Você sacou " + saque);
        return saldo;
    }
}


