package practicarArrays;

public class maximo {
    public static int max(int [] array) {

        int mayor = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > mayor) {

                mayor = array[i];

            }

        }
        return mayor;
    }

    public static void main(String[] args) {

        int [] array = {2, 4, 5, 6, 7, 11, 33, 45, 1, 3};
        int max = max(array);

        System.out.println("El numero mas grande del array es: " + max);

    }
}
