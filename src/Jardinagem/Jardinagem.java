package Jardinagem;

import java.util.Scanner;

public class Jardinagem {
    public String nomeJardim;
    public double qtdMetros;
    public int qtdPlantas;
    public double qtdMetrosGrama;
    public double kilosAdubo;
    public double valorMetroGrama;
    public double valorConteGrama;
    public double usaAdubo;
    public double valorAdubo;
    public double receberAdubo;

    public Jardinagem(String nomeJardim, double qtdMetros, int qtdPlantas, double qtdMetrosGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;

    }
    public void usarAdubo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de metros da grama ");
        qtdMetrosGrama = input.nextDouble();
        usaAdubo = qtdMetrosGrama * 50;
        kilosAdubo = usaAdubo/1000;
        System.out.println("A quantidade de adubo usada será de " + usaAdubo + " e em quilos será de " + kilosAdubo);

    }
    public void  precoAdubo() {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Qual o valor do adubo? ");
        valorAdubo = input2.nextDouble();
        receberAdubo = valorAdubo * usaAdubo;
        System.out.println("Valor a cobrar do adubo R$ " + receberAdubo);
    }

    public void precoCorteGrama() {
        valorMetroGrama = 50;
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
        System.out.println("O valor de grama por metro é de R$" + valorConteGrama);
    }

    }
