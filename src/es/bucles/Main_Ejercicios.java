package es.bucles;

public class Main_Ejercicios {
    public static void main(String[] args) {
        int numero_if = 1 ;
        int numero_while = -10;
        int numero_for = 0;
        String estacion ="Otoño";

        if (numero_if < 0){
            System.out.println("El numero es NEGATIVO");
        } else if (numero_if == 0){
            System.out.println("El numero es CERO");
        }else
            System.out.println("El numero es POSITIVO");

        System.out.println();

       /* while(numero_while < 3 ){
            System.out.println(numero_while);
            numero_while++;
        }*/

        System.out.println();

        do {
            System.out.println(numero_while);
            numero_while++;

        }while (numero_while<3);

        System.out.println();

        for ( numero_for = 0; numero_for <=3 ; numero_for++) {
            System.out.println(numero_for);
        }

        switch (estacion){
            case "otoño":
                System.out.println("Estamos en otoño ");
                break;
            case "invierno":
                System.out.println("estamos en invierno ");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;

            default:
                System.out.println("UwU");

        }
    }
}
