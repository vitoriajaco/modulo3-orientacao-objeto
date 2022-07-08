package retangulo;

public class MainRetangulo {
    
        public static void main(String[] args) {
            //Scanner input = new Scanner(System.in);
            Retangulo r1 = new Retangulo();
            double ladoA = r1.ladoA;
            double ladoB = r1.ladoB;

            System.out.println("Coloque o valor do lado A");
           // ladoA = input.nextDouble();
            System.out.println("Coloque o valor do lado B");
            //ladoB = input.nextDouble();

            System.out.println("Valor de A = " + ladoA);
            System.out.println("Valor de B = " + ladoB);

            System.out.println("Deseja alterar valor dos lados: S/N");
           // input.next();




            //if (usuario.equalsIgnoreCase("s")) {
                r1.alteraValorLados();
          //  } else {

            }

        }
    //}

    

