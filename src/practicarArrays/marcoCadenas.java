package practicarArrays;

import java.util.Scanner;

public class marcoCadenas {
    public static int pMasGrande(String[] cadenas){
        int maxima = cadenas[0].length();
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > maxima) {
                maxima = cadenas[i].length();
            }
        }
        return maxima;
    }
    public static String asteriscos(int maxima){
        String asteriscos = "";
        for (int i = 0; i < maxima + 4; i++) {
            asteriscos += "*";
        }
        return asteriscos;
    }

    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto");
        Scanner sc = new Scanner(System.in);
        int max;
        Scanner miScanner;

        miScanner = new Scanner(System.in);
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = miScanner.next();
        }
        max = pMasGrande(cadenas);
        System.out.println(asteriscos(max));

        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("* " + cadenas[i]);
            for (int j = cadenas[i].length(); j <= max; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println(asteriscos(max));


    }
}
