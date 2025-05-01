import java.util.Scanner;

public class InformacionAcademica {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        //Nombramos y pedimos el valor a nuestras variables y arrays por medio del usuario
        int suma = 0;
        System.out.print("Introduce tu nombre: ");
        String nombre = scann.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scann.nextInt();

        System.out.print("Introduce tu carrera: ");
        String carrera = scann.nextLine();
        String Carrera = scann.nextLine();

        System.out.print("Introduce el numero de asignaturas: ");
        int nasignaturas = scann.nextInt();

        String[] asignatura = new String[nasignaturas];
        int[] notas = new int[nasignaturas];

        for (int i = 0; i < nasignaturas; i++){

            System.out.print("Introduce la asignatura: ");
            asignatura[i] = scann.nextLine();
            asignatura[i] = scann.nextLine();

            System.out.print("Introduce la calificacion: ");
            notas[i] = scann.nextInt();


        }

        //Imprimimosl a informacion personal
        System.out.println("Informacion personal: " + nombre + " edad: " + edad + " años " + "carrera: " + Carrera);

        System.out.println("");

        //Hacemos un bloque de codigo en donde mostrara la posicion de la calificacion y su respectiva asignatura
        for (int i = 0; i < notas.length; i++) {

            System.out.println(asignatura[i] + ": " + notas[i]);

        }

        //Sumamos las calificaciones y sacamos su promedio y lo imprimimos junto con su comprobacion de 
        //si aprobo o no aprobo
        for (int i = 0; i < notas.length; i++) {
            
            suma += notas[i];
        }

        double promedio = suma / notas.length;

        System.out.println(""); 

        System.out.print(promedio + ": ");

        if (promedio >= 60) {
            
            System.out.println("APROBADO");

        } else {

            System.out.println("REPROBADO");

        }
        
        scann.close();
    }
}
