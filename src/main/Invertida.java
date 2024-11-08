package main;

public class Invertida {
    public static String invertir(String original){
        String [] palabras = original.split(" ");
        String invertido = "";
        String resultado = "";

        for (int i = palabras.length - 1; i >= 0; i--) {

            resultado += palabras[i] + " ";

        }

        for (int i = 0; i < palabras.length; i++) {

            invertido = palabras[i] + " " + invertido;

        }
        
        return invertido;
    }

    public static void main(String[] args) {

        String [] original = {"Esto es una frase"};
        String invertido = invertir(original[0]);
        System.out.println("La frase invertida es: " + invertido);

    }
}
