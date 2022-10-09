import java.util.Scanner;

public class recursividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        System.out.println(potenciaRecursiva(n, m));
    }

    public static int potenciaRecursiva(int n, int m) {
        if (n <= 0) {
            return 0;
        } else if (m <= 0) {
            return 1;
        } else {
            return n * potenciaRecursiva(n, m - 1);
        }
    }
}
