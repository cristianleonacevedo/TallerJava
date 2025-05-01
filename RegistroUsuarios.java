import java.util.ArrayList;
import java.util.Scanner;

public class RegistroUsuarios {

    public static void Usuario () {

         //Nombramos nuestra funcion Scanner
        Scanner scan = new Scanner(System.in);

         int total = scan.nextInt(); scan.nextLine();

        //Nombramos, definicimos y delimitamos nuestros arrays
        String[] nombres = new String [total];
        int [] edades = new int[total];


         for (int i = 0; i < total; i++) {

             //Le pedimos al usuario la informacion para el array nombres
            System.out.println("Introduce el nombre");
            System.out.println("");
            
            //Conforme el usuario introduzca un nombre se pasara al siguiente indice del array hasta el limite 
            //que ya hemos definido
                 nombres[i] = scan.nextLine();

            //Le pedimos al usuario la informacion para el array edades
            System.out.println("");
            System.out.println("Introduce la edad");
            System.out.println("");

         //Conforme el usuario introduzca una edad se pasara al siguiente indice del array hasta el limite 
         //que ya hemos definido

            edades[i] = scan.nextInt();
        }
        
        scan.close();

    }

    public static void Edades(int edades[]) {

        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < edades.length; i++) {
            
            //Al comprobar si el dice es verdadero o falso mostramos un mensaje dependiendo del boolean recibido
            if (edades[i] < 18) {

                menores += 1;

            } else {

                mayores += 1;

            }

        }


    }

    public static void main(String [] args) {
        
        Usuario();
        
        ArrayList<Usuario> lista = new ArrayList<>();

        Edades(null);

    }
}
