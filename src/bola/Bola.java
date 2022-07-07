package bola;

// Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma circunferência, cor, marca e velocidade.
// Após a modelagem, instanciar objetos diferentes no método main para testes.


public class Bola {
    public double circunferencia;
    public String cor;
    public String marca;
    public double velocidade;

    public Bola(double circunferencia, String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public void mostraCor() {
        System.out.println(this.cor);
    }

    public void trocaCor(String cor){
        this.cor = cor;

    }
}
