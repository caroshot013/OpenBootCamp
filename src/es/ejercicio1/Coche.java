package es.ejercicio1;

public class Coche {
    //propiedades
    int num_puertas = 4;

    //metodo principal
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.println("El coche en estado incial tiene: " + coche1.num_puertas);
        coche1.incrementoPuertas();
        System.out.println("El cochde después de llamar a la funcion tiene: " + coche1.num_puertas);
    }

    //funcion incremento puertas
    public void incrementoPuertas(){
        num_puertas++;
    }
}
