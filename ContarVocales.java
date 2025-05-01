import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int contador = 0;

        //Pedimos la palabra a analizar al usuario
        System.out.println("Introduce la palabra (sin espacios): ");
        String palabra = scann.nextLine();

        //Comprobamos cuantas vocales tiene (contador)
        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
                contador++;
            }

            //Imprimimos la cantidad de vocales (contador)
            System.out.println("La palabra tiene: " + contador + " vocales");
            
            scann.close();
    }
}
