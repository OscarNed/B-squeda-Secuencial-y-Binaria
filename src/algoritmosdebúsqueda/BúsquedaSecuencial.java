package algoritmosdebúsqueda;

/**
 * @author OscarNedzelsky A00513376
 */
public class BúsquedaSecuencial {
    public static void BusquedaSec(int num, int arr []){
        int ciclos = 0; //Esta variable cuenta cuántos ciclos se lleva el ordenador en encontrar el número.
        for(int i = 0; i < 50; i++){ //Este ciclo busca el número de uno por uno en las posiciones del arreglo
            ciclos = ciclos + 1;
            if (num == arr [i]){ //Si el número que se busca coincide con la posición actual en la que se está buscando muestra los siguientes mensajes.
                System.out.println("El número ha sido encontrado en la posición " + (i + 1) + " del arreglo.");
                System.out.println("La búsqueda se realizó en " + ciclos + " ciclos.\n");
            }
        }
    }
}
