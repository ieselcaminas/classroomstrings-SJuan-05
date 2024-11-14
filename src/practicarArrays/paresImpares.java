package practicarArrays;

public class paresImpares {
    public static int impares (int [] arrays){

        int contadorPar = 0;

        for (int i = 0; i < arrays.length; i++){

            if (arrays[i] % 2 == 0){

                contadorPar++;

            }

        }

        return contadorPar;

    }

    public static int pares (int [] arrays){

        int contadorImpar = 0;

        for (int i = 0; i < arrays.length; i++){

            if (arrays[i] % 2 != 0){

                contadorImpar++;

            }

        }

        return contadorImpar;

    }

    public static void main(String[] args) {

        int [] array = {2, 3, 4, 5, 8, 8, 9, 3, 3, 1};
        int par = pares(array);
        int impares = impares(array);

        System.out.println("Hay " + par + " impares y " + impares + " par");

    }
}
