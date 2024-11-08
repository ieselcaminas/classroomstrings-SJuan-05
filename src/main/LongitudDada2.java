package main;

import java.util.Scanner;

public class LongitudDada2 {
    public static boolean verdaderoFalso (String cadena, String [] palabras, int valor){

        boolean existe = false;

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() == valor){

                existe = true;

            }

        }

        return existe;
    }




    public static void main(String[] args) {

        String cadena = "Hola Despues longitud Dada Abuela Sabe";
        String [] palabras = cadena.split(" ");
        boolean existe_metodo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una longitud de caracteres y le diremos cuantas palabras tienen dicha longitud");
        int valor = sc.nextInt();

        existe_metodo = verdaderoFalso(cadena, palabras, valor);

        if (existe_metodo){

            System.out.println("Si existe alguna palabra con " + valor + " caracteres");

        }

    }
}
