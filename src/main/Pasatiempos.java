package main;

public class Pasatiempos {
    public static String sustituirLetra (String [] pasatiempo, String palabras){

        for (int i = 0; i < pasatiempo.length; i++) {

            palabras = palabras.replace("a", ".");
            palabras = palabras.replace("e", ".");
            palabras = palabras.replace("i", ".");
            palabras = palabras.replace("o", ".");
            palabras = palabras.replace("u", ".");
            palabras = palabras.replace("A", ".");
            palabras = palabras.replace("E", ".");
            palabras = palabras.replace("I", ".");
            palabras = palabras.replace("O", ".");
            palabras = palabras.replace("U", ".");

        }

        return palabras;
    }

    public static void main(String[] args) {

        String pasatiempo = "Un ejemplo de pasatiempos";
        String [] palabras = pasatiempo.split("");

        System.out.println(sustituirLetra(palabras, pasatiempo));

    }

}
