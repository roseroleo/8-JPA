
package libreria;

import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        AutorServicio autorService = new AutorServicio();
        
        int opcion = 0;
        boolean correcto = false, salir = false;
        try {
            do {
                System.out.println("\n*** MENU DE OPCIONES ***");
                System.out.println("*******************************************************************************\n"
                        + "1) Búsqueda de un Autor por nombre. \n"
                        + "2) Búsqueda de un libro por ISBN.\n"
                        + "3) Búsqueda de un libro por Título. \n"
                        + "4) Búsqueda de un libro/s por nombre de Autor.\n"
                        + "5) Búsqueda de un libro/s por nombre de Editorial.\n"
                        + "0) Salir.\n"
                        + "*******************************************************************************");
                opcion = lr.nextInt();
                switch (opcion) {
                    case 1:
                        autorService.consulta();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        throw new AssertionError();
                }
            } while (!correcto && !salir);
        } catch (Exception e) {
            System.out.println("Error en menu " + e);
        }
    }
    
}
