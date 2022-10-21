import java.util.Random;

/**
 * 
 * É possível notar que para um array de 500 posições, o tempo de execução do
 * algoritmo de busca binária é em geral maior que o algoritmo de busca
 * sequencial. Nesse caso de testes, o algoritmo de busca binária foi 2 vezes
 * mais lento que o algoritmo de busca sequencial. O tempo em nano segundos é
 * exibido no console.
 * 
 * 
 * Entretanto, isso não é verdade para todos os casos: de modo geral, o
 * algoritmo de busca binária é mais rápido que o algoritmo de
 * busca sequencial, mas isso depende do tamanho do array e da posição do
 * elemento a ser buscado. O algoritmo de busca binária é mais rápido quando o
 * array é grande e o elemento a ser buscado está no meio
 * do array. Já o algoritmo de busca sequencial é mais rápido quando o array é
 * pequeno ou quando o elemento a ser buscado está no início do array.
 * 
 * @author Emanuel Borges Alves Menezes - RA 121111812
 * 
 * 
 * 
 **/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10000);
        }
        array = insertionSort(array);
        int random = array[Math.abs(new Random().nextInt(500)) % array.length];

        long startTime = System.nanoTime();
        System.out.println(binarySearch(array, random));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(" Busca binária: " + duration + " nano segundos");

        startTime = System.nanoTime();
        System.out.println(linearSearch(array, random));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(" Busca sequencial: " + duration + " nano segundos");
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
