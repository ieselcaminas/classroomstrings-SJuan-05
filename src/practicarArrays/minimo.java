package practicarArrays;

public class minimo {
    public static int min(int [] array){

        int min = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min){

                min = array[i];

            }
        }

        return min;

    }

    public static void main(String[] args) {

        int [] array = {4, 5, 6, 7, 8, 2, 1, 11, 232, 50};
        int min = min(array);

        System.out.println("El numero mas pequeño del array es: " + min);


    }
}
