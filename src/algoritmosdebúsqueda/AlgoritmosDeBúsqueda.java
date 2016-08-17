package algoritmosdebúsqueda;
import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 */
public class AlgoritmosDeBúsqueda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr [] = new int [50]; //Crea el arreglo.
        for (int i = 1; i <= 50; i++){ //Llena el arreglo con los números del 1 al 50.
            arr [(i - 1)] = i;
        }
        System.out.println("El arreglo está listo.");
        System.out.println("Indique un número del 1 al 50 para buscar en el arreglo:");
        int num = scan.nextInt(); //El usuario ingresa un número del 1 al 50.
        System.out.println("\nIniciando la búsqueda secuencial...\n");
        BúsquedaSecuencial.BusquedaSec(num, arr); //Inicia el método de búsqueda secuencial.
        System.out.println("Iniciando la búsqueda binaria...\n");
        BusquedaBinaria.BusquedaBin(num, arr); //Inicia el método de búsqueda binaria.
    }
    
}
