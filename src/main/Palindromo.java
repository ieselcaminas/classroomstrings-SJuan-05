package main;

public class Palindromo {
    public static boolean palindromoSioNo (String palabra){

        boolean palindromo = true;

        for (int i = 0; i < palabra.length() / 2; i++) {

            if (palabra.charAt(i) == palabra.charAt(palabra.length() - 1 - i)) {

                palindromo = true;

            } else {

                palindromo = false;

            }
        }

        return palindromo;

    }

    public static void main(String[] args) {

        String palabra = "radar";
        boolean palindromo = palindromoSioNo(palabra);

        if (palindromo) {

            System.out.println("Si es palindromo");

        } else {

            System.out.println("No es palindromo");

        }
    }
}
