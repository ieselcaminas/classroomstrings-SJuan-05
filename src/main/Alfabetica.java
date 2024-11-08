package main;

public class Alfabetica {
    public static boolean modoAlfabetico (String palabra){

        boolean alfabetico_metodo;

        for (int i = 0; i < palabra.length() - 1; i++) {

            if (palabra.charAt(i) > palabra.charAt(i + 1)){

                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String palabra = "amor";
        boolean alfabetico;

        alfabetico = modoAlfabetico(palabra);


        if (alfabetico) {

            System.out.println("Esta en orden alfabetico");

        } else {

            System.out.println("No esta en orden alfabetico");

        }
    }
}
