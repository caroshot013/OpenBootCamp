package es.bucles;

public class Main_While_DoWhile {
    public static void main(String[] args) {

        int contador = 10;

       /* while (contador > 0){
            System.out.println(contador);
            contador = contador - 3;
            //contador-- es la forma correcta y menos larga
        }*/

        do {
            System.out.println(contador);
            contador--;

        } while(contador>1);
    }
}
