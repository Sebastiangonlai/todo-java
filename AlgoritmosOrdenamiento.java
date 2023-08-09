import java.util.Arrays;

/* 
    "Un algoritmo es un conjunto de instrucciones finitas y ordenadas que resuelven un problema o realizan una tarea específica."
*/

// ALGORITMOS ORDENAMIENTO //
public class AlgoritmosOrdenamiento {

    // ----> Bubble Sort - Ordenamiento de burbuja <----
    public static void burbuja(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // For 1
            for (int j = 0; j < arr.length - i - 1; j++) { // For 2
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } // Fin for 2
        } // Fin for 1
    }

    // ----> Selection Sort - Ordenamiento por selección <----
    public static void seleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // ----> Insertion Sort - Ordenamiento por inserción <----
    public static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // Recorre desde el segundo elemento
            int aux = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j] > aux)) { // Desplaza mayores hacia la derecha
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }
    }

    // ----> Merge Sort - Ordenamiento por mezcla <----
    public static void merge(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] izq = Arrays.copyOfRange(arr, 0, mid); // Arrays.copyOfRange(array,inicio,fin)
            int[] der = Arrays.copyOfRange(arr, mid, arr.length);
            merge(izq);
            merge(der);
            int i = 0, j = 0, k = 0;
            while (i < izq.length && j < der.length) {
                if (izq[i] <= der[j]) {
                    arr[k++] = izq[i++];
                } else {
                    arr[k++] = der[j++];
                }
            }

            while (i < izq.length) {
                arr[k++] = izq[i++];
            }

            while (j < der.length) {
                arr[k++] = der[j++];
            }
        }
    }

    // ----> Quick Sort - Ordenamiento rápido (1) <----
    public static void rapido(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionar(arr, inicio, fin);
            rapido(arr, inicio, pivote - 1);
            rapido(arr, pivote + 1, fin);
        }
    }

    // ----> Quick Sort - Ordenamiento rápido (2) <----
    public static int particionar(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    // ----> Imprimir array <----
    public static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // -------> Main <-------
    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 4, 2, 7, 6, 9, 1 };

        System.out.println("Lista Original --> " + Arrays.toString(arr));
        burbuja(arr);
        // seleccion(arr);
        // insercion(arr);
        // merge(arr);
        // rapido(arr, 0, arr.length - 1);
        System.out.print("\nLista Ordenada --> " + Arrays.toString(arr));

        // --> Alternativas impresion array <--
        // System.out.print(Arrays.toString(arr)); // con toString()
        // imprimir(arr); // con For()
        // Arrays.stream(arr).forEach(System.out::println); // con stream().forEach()
    }
}

/*
 *
 * En Java, existen varios algoritmos de ordenamiento que se pueden utilizar
 * para ordenar arreglos o listas. Algunos de los más comunes son:
 * 
 * Bubble Sort (Ordenamiento de burbuja):
 * Este algoritmo compara pares de elementos adyacentes y los intercambia si
 * están en el orden equivocado. Repite este proceso varias veces hasta que la
 * lista esté ordenada.
 * 
 * Selection Sort (Ordenamiento por selección):
 * Este algoritmo encuentra el elemento más pequeño en la lista y lo mueve al
 * principio. Luego encuentra el siguiente elemento más pequeño y lo mueve al
 * segundo lugar, y así sucesivamente, hasta que la lista esté ordenada.
 * 
 * Insertion Sort (Ordenamiento por inserción):
 * Este algoritmo recorre la lista de izquierda a derecha y compara cada
 * elemento con los elementos que ya están ordenados. Si un elemento es más
 * pequeño que el elemento que le precede, se intercambian. Este proceso se
 * epite hasta que la lista esté ordenada.
 * 
 * Merge Sort (Ordenamiento por mezcla):
 * Este algoritmo divide la lista en mitades, ordena cada mitad y luego las
 * fusiona para producir una lista ordenada completa.
 * 
 * Quick Sort (Ordenamiento rápido):
 * Este algoritmo elige un elemento pivote y lo utiliza para dividir la lista en
 * dos partes: una con elementos menores que el pivote y otra con elementos
 * mayores. Luego aplica el mismo proceso recursivamente a cada parte hasta que
 * la lista esté ordenada.
 * 
 * Para implementar cualquiera de estos algoritmos en Java, se pueden utilizar
 * estructuras de control de flujo como bucles for y while.
 *
 */
