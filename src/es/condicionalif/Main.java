package es.condicionalif;

public class Main {
    public static void main(String[] args) {
        String estacion = "otoño";

        if (estacion == "primavera"){
            System.out.println("es primavera");
        }
        else if (estacion == "verano"){
            System.out.println("es verano");
        }else{
            System.out.println("Es otra estacion");
        }
    }
}
