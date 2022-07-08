package retangulo;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void alteraValorLados(){
        System.out.println("alteraValorLados");
    }

    public void alteraValorLados(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public String mostrarLados(double ladoA, double ladoB){
        System.out.println("Valor de ladoA" + ladoA);
        System.out.println("Valor de ladoA" + ladoB);
        return null;
    }
    public double calcularPerimetro(){
        double total;
        total = 2 * (ladoA + ladoB);
        return total;
    }
}
