package main;

import static java.lang.Character.isDigit;

public class Digitos {
    public static int numDigitos (String cadena, String [] palabras){

        int contador_metodo = 0;

        for (int i = 0; i < palabras.length; i++) {

            for (int j = 0; j < palabras[i].length(); j++) {

                if (isDigit(palabras[i].charAt(j))) {

                    contador_metodo++;

                }
            }
        }

        return contador_metodo;

    }



    public static void main(String[] args) {

        String cadena = "Un 10, un 20, y un 5";
        String [] palabras = cadena.split(" ");
        int contador = numDigitos(cadena, palabras);



        System.out.println("La cadena de caracteres tiene " + contador + " caracteres.");

    }
}
