//Classe Bola: Crie uma chamada Jabulani
//Atributos: Cor, circunferência, material
//Métodos: trocaCor e mostraCor

package bola;

public class MainBola {
    public static void main(String[] args) {
        Bola bola = new Bola(8.35, "branca","nike", 60.0);
        bola.mostraCor();
        bola.trocaCor("rosa");
        bola.mostraCor();
    }

}

