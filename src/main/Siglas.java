package main;

import static java.lang.Character.isUpperCase;

public class Siglas {
    public static String siglasMetodo(String cadena, String [] palabras){

        String siglas_metodo = "";

        for (int i = 0; i < palabras.length; i++) {

            if (isUpperCase(palabras[i].charAt(0)) ) {

                siglas_metodo += palabras[i].charAt(0);

            }
        }

        return siglas_metodo;

    }


    public static void main(String[] args) {

        String cadena = "Escuela Oficial de Idiomas";
        String [] palabras = cadena.split("");
        String siglas = siglasMetodo(cadena, palabras);


        System.out.println(siglas);

    }
}
