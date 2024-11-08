package main;

import java.util.Scanner;

public class LongitudDada3 {
    public static boolean cantidadMayor (String cadena, String [] palabras, int valor){

        boolean mayor = false;

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > valor){

                mayor = true;

            }

        }
        return mayor;
    }



    public static void main(String[] args) {

        String cadena = "Hola Despues longitud Dada Abuela Sabe";
        String [] palabras = cadena.split(" ");
        boolean mayor_metodo;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una longitud de caracteres y le diremos cuantas palabras tienen dicha longitud");
        int valor = sc.nextInt();

        mayor_metodo = cantidadMayor(cadena, palabras, valor);


        if (mayor_metodo == true){

            System.out.println("Hay alguna palabra larga");

        } else {

            System.out.println("Todas las palabras de la cadena son cortas");

        }

    }
}
