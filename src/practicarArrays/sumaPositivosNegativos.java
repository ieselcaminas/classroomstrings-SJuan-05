package practicarArrays;

public class sumaPositivosNegativos {
    public static int sumaPositivos(int[] arrays) {

        int sumaPos = 0;

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] >= 0) {

                sumaPos += arrays[i];

            }

        }

        return sumaPos;

    }

    public static int sumaNegativos(int[] arrays) {

        int sumaNeg = 0;

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] < 0) {

                sumaNeg += arrays[i];

            }

        }

       return sumaNeg;

    }

    public static void main(String[] args) {

        int [] arrays = {22,9,3,2,5,6,-7,-10,-3,-2};
        int positivos = sumaPositivos(arrays);
        int negativos = sumaNegativos(arrays);

        System.out.println("La suma de los números positivos es: " + positivos);
        System.out.println("La suma de los números negativos es: " + negativos);

    }


}
