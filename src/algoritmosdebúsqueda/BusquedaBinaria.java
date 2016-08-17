package algoritmosdebúsqueda;

/*
 * @author OscarNedzelsky A00513376
 */
public class BusquedaBinaria {
    public static void BusquedaBin(int num, int arr []){
        int inicio = 0, fin = 49, centro, valorCentro,ciclos = 0;
        while (inicio < fin) { //Mientras el valor de inicio sea menor que el del fin se ejecutará el ciclo.
            ciclos = ciclos + 1; //Esta variable cuenta cuantos ciclos tarda el ordenador en realizar la búsqueda.
            centro = ((inicio + fin) / 2);
            if (centro == inicio) { //Este if cambia el valor del centro para que no coincida con el valor de inicio, puesto que puede causar problemas y provocar que el loop se ejecute infinitamente.
                centro = centro + 1;
            }
            valorCentro = arr [centro];
            if (valorCentro == num){ //Si el valor del centro es igual al número que se busca se muestran los siguientes mensajes y se finaliza el ciclo.
                System.out.println("El número ha sido encontrado en la posición: " + (centro + 1) + " del arreglo.");
                System.out.println("La búsqueda se realizó en " + ciclos + " ciclos.");
                inicio = fin + 1;
            }
            else { 
                if (num < valorCentro) { //Si el valor del centro no coincide con el número que se busca y este número es menor, el nuevo fin pasa a ser el valor que estaba en el centro.
                    fin = centro;
                }
                else { //Si el valor del centro no coincide con el número que se busca y este número es mayor, el nuevo inicio pasa a ser el valor que estaba en el centro.
                    inicio = centro;
                }
            }
        }
    }
}
