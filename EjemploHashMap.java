/*
 * Archivo: EjemploHashMap.java
 */

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        if (hashMap.containsKey("A")) {
            System.out.printf("Contiene la clave A. Su valor es: %d\n", hashMap.get("A"));
        }

        if (hashMap.containsValue(0)) {
            System.out.println("Contiene el valor 0");
        }

        int aparicionesDeA = hashMap.get("A");
        hashMap.remove("A");

        // Ahora ponemos varios elementos para imprimirlos
        hashMap.put("A", 1);
        hashMap.put("E", 12);
        hashMap.put("I", 15);
        hashMap.put("O", 0);
        hashMap.put("U", 0);
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Clave: %s. Valor: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
