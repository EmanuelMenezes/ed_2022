public class recursividade2 {
    public static void main(String[] args) {
        print0toN(10);
    }

    public static void print0toN(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            print0toN(n - 1);
            System.out.println(n);
        }
    }
}
