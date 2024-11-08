package main;

import java.util.Scanner;

public class LongitudDada1 {
    public static int cantidad_palabras(String [] palabras, String cadena, int valor) {

        int cantidad = 0;

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].length() > valor){

                cantidad++;

            }

        }

        return cantidad;
    }


    public static void main(String[] args) {

        String cadena = "Hola Despues longitud Dada Abuela Sabe";
        String [] palabras = cadena.split(" ");
        int cantidad = 0;
        int cantidad_metodo;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una longitud de caracteres y le diremos cuantas palabras tienen dicha longitud");
        int valor = sc.nextInt();

        cantidad_metodo = cantidad_palabras(palabras, cadena, valor);

        System.out.println("La cantidad de palabras que coinciden con el numero de caracteres que has introducido es: " + cantidad_metodo);

    }
}
