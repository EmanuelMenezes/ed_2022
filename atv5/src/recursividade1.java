public class recursividade1 {
    public static void main(String[] args) {

    }

    public static int somaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }
}
