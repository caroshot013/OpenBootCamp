package es.bucles;

public class Main_For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            //la parte de "accion" (i++) se ejecuta despues de haber imprimido la variable 'i'
        }
        System.out.println();

        int valores [] = new int[]{10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length ; i++) {
            System.out.println(valores[i]);
        }
    }
}
