package main;

public class parentesis {
    public static boolean parentizado (String texto){

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == '('){

                contador++;

            } else if (texto.charAt(i) == ')'){
                
                contador--;

                if (contador < 0){

                    return false;
                }
                
            }
        }

        return contador == 0;

    }

    public static void main(String[] args) {

        String texto = "Esto (es (un ejemplo) (de) una (cadena bien parentizada)";
        int contador = parentizado(texto);

        if (contador){

            System.out.println("La cadena de caracteres esta bien parentizada");

        } else {

            System.out.println("La cadena de caracteres no esta bien parentizada");

        }
    }
}
