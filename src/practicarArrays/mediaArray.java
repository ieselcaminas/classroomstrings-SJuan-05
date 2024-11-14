package practicarArrays;

public class mediaArray {
    public static double mediaTotal (double[] numsMedia) {

        double sumaMedia = 0;
        double mediaTotal;

        for (int i = 0; i < numsMedia.length; i++) {

            sumaMedia += numsMedia[i];

        }

        mediaTotal = sumaMedia / numsMedia.length;

        return mediaTotal;

    }

    public static void main(String[] args) {
        double [] numsMedia = {5, 7, 9, 3, 1, 2, 5, 8, 0, 3};
        double mediaTotal = mediaTotal(numsMedia);

        System.out.println("La media del array de 10 numeros es: " + mediaTotal);

    }
}
