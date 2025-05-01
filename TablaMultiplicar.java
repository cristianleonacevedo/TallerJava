import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int resultado = 0;

        //Pedimos el numero que vamos a multiplicar al usuario
        System.out.println("Introduce el numero que quieras multiplicar");
        int num = scann.nextInt();

        //Multiplicamos he imprimimos la informacion
        for (int i = 1; i <= 10; i++) {
            resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }
        
        scann.close();
    }
}
