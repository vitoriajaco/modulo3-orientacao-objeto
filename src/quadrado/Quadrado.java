//Classe Quadrado: Crie uma classe que modele um quadrado:
//Atributos: Tamanho do lado
//Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

package quadrado;

import java.util.Scanner;

public class Quadrado {
    double lado;

    public Quadrado() {
        this.lado = lado;
    }

    public void mudarValorLado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque um novo valor do lado: ");
        lado = input.nextDouble();
        System.out.println(lado);
    }

    public double retornarValorLado(){
        return lado;
    }

    public double area() {
        System.out.println("O valor da área é de:" + lado * lado);

        return lado;
    }
}
