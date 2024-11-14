package practicarArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class dni {
    public static String letraDNI (String [] letrasDNI, int numDNI){
      int resto;
      String letra;

      resto =  numDNI % 23;
      letra = letrasDNI[resto];

      return letra;

    }

    public static void main(String[] args) {

        String [] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int numDNI = 97430947;
        String letraDNI = letraDNI(letrasDNI, numDNI);

        System.out.println("La letra del DNI es: " + letraDNI);

    }
}
