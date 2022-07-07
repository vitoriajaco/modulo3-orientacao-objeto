package quadrado;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do lado? ");
        q.lado = input.nextDouble();
        System.out.println(q.lado);

        q.area();

    }
}
