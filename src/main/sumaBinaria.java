package main;

public class sumaBinaria {
    public static String sumaBinariaa(String num1, String num2) {

        char b1;
        char b2;
        int bit1;
        int bit2;
        int acarreo = 0;
        String res = "";
        int suma;

        for (int i = num1.length() - 1; i > 0; i--) {

            b1 = num1.charAt(i);
            b2 = num2.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;

            if (suma == 0) {

                res = "0" + res;
                acarreo = 0;

            } else if (suma == 1) {

                res = "1" + res;
                acarreo = 0;

            } else if (suma == 2) {

                res = "0" + res;
                acarreo = 1;

            } else {

                res = "1" + res;
                acarreo = 1;

            }

            if (acarreo == 1) {

                res = "1" + res;

            }
        }

        return res;

    }

    public static void main(String[] args) {

        String num1 = "0100";
        String num2 = "0101";

        String Binario = sumaBinariaa(num1, num2);


        System.out.println(Binario);

    }
}

