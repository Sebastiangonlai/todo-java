import java.util.Arrays;

/* 
    "Un algoritmo es un conjunto de instrucciones finitas y ordenadas que resuelven un problema o realizan una tarea específica."
*/

// ALGORITMOS BÚSQUEDA //
public class AlgoritmosBusqueda {

    // ----> Búsqueda binaria <----
    public static int busquedaBinaria(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int busqued(int[] arr, int num) {
        int buscar = 9;
        int index = Arrays.binarySearch(num, buscar);
        if (index >= 0) {
            System.out.println("El valor " + buscar + " se encuentra en el índice " + index);
        } else {
            System.out.println("El valor " + buscar + " no se encuentra en el arreglo");
        }
    }

    // ----> Imprimir array <----
    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ----> Main <----
    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 4, 2, 7, 6, 9, 1 };
        int num = 2;

        System.out.println("Lista Original --> " + Arrays.toString(arr));
        System.out.print(busquedaBinaria(arr, num));
        // System.out.print("\nLista Ordenada --> " + Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]); }
    } // Fin main

} // Fin Algoritmos