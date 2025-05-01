import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
       Scanner scann = new Scanner(System.in);

       //Pedimos los 3 numeros al usuario
        System.out.println("Introduce el primer numero");
        int n1 = scann.nextInt();

        System.out.println("Introduce el segundo numero");
        int n2 = scann.nextInt();

        System.out.println("Introduce el tercer numero");
        int n3 = scann.nextInt();

        //Comprobamos cual es el mayor
        int mayor = n1;

        if (n2 > mayor) {

            mayor = n2;
        }

        if (n3 > mayor) {

            mayor = n3;

        }
     
        //Imprimimos el resultado
        System.out.println("El mayor de los tres es: " + mayor);

        scann.close();
    }
    
}
